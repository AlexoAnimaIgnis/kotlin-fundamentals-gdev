package com.app.kotlinjava

/**
 * we need only one instance of repository. to do so, we replaced the keyword 'class'
 * to 'object'
 */
object Repository {
    private val _users = mutableListOf<User>()
    val users: List<User>
        get() = _users

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")

        _users.add(user1)
        _users.add(user2)
        _users.add(user3)
    }

    val formattedUserNames: List<String>
        get() {
            return _users.map { user ->
                if (user.lastName != null) {
                    if (user.firstName != null) {
                        "${user.firstName} ${user.lastName}"
                    } else {
                        user.lastName ?: "Unknown"
                    }
                } else {
                    user.firstName ?: "Unknown"
                }
            }
        }

    /**
     * In java, this is equivalent to declaring STATIC FIELDS
     * This is where we declare the static fields and functions
     */
//    companion object {
//        private var INSTANCE: Repository? = null
//        val instance: Repository?
//            get() {
//                if (INSTANCE == null) {
//                    synchronized(Repository::class.java) {
//                        if (INSTANCE == null) {
//                            INSTANCE = Repository()
//                        }
//                    }
//                }
//                return INSTANCE
//            }
//    }
}