'use strict'

const User = use("App/Models/User")

class UserController {

  async create({request}){
    const data = request.only(["username","email","password","cpf","equipe"])

    const user = User.create(data)
    return user
  }

  async authenticate({request,auth}){
    const {email,password} = request.all()

    const token = auth.attempt(email,password)
    return token
  }

}

module.exports = UserController
