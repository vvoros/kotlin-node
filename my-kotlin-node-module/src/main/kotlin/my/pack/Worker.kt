package my.pack

class Worker {
  var os: dynamic = common.require("os")

  fun listUsers(): String {
    val users = arrayListOf<User>()

    for (i in 1..5) {
      val user = User(i, "User $i")
      users.add(user)
    }

    return JSON.stringify(users)
  }

  fun platform(): String {
    return os.platform()
  }
}
