<template>
  <div id="login" style="width:450px; display:inline-block;">
    <br></br>
      <h1>로그인</h1>
    <br></br>
      <v-form v-model="valid" ref="form">
        <v-text-field label="아이디 (8~14자리(영문,숫자))" v-model="id" :rules="idRules" :counter="14"></v-text-field>
        <v-text-field label="비밀번호 (8~14자리(영문,숫자,특수문자))" type="password" v-model="pw" :rules="pwRules" :counter="14"></v-text-field>
        <v-btn @click="login" :disabled="!valid">확인</v-btn>
      </v-form>
    <pre>{{$data}}</pre>
  </div>
</template>

<script>
  export default {
    data: () => ({
      valid:false,
      id:'',
      idRules: [
        v => !!v || '아이디를 작성해주세요.',
        v => v.length <= 14 || '8~14자리를 입력해주세요.'
      ],
      pw:'',
      pwRules: [
        v => !!v || '비밀번호를 작성해주세요.',
        v => v.length <= 14 || '8~14자리를 입력해주세요.'
      ]
    }),
    methods: {
      login () { // 클릭 : 로그인 완료
        if(this.$refs.form.validate()) {
          this.$axios.post('/api/user/login', {
            id:this.id,
            pw:this.pw
          }) .then((response) => {

              console.log('login')
              this.result = response.data
              console.log(this.result)

              // if (로그인 되었을 때의 result){
              //   this.$router.push('main')
              // }else{
              //    오류메세지 출력
              // }
          })
        }
      }
    }
  }
</script>

<style lang="css">

</style>
