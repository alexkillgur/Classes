package classes

class Teacher {
    String firstName
    String lastName
    Date dateOfBirth

    static hasMany = [
            lesson: Lesson,
            audience: Audience,
            scholar: Scholar
    ]

    static constraints = {
        firstName ( blank:false, maxSize:20, nullable:false )
        lastName ( blank:false, maxSize:20, nullable:false )
        dateOfBirth ( blank:false, nullable:false )
    }

    String toString () {
//        firstName
        "$lastName, $firstName"
    }
}
