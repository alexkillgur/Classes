package classes

class Scholar {
    String firstName
    String lastName
    Date dateOfBirth
//    Teacher teacher
//    Groups group

    static belongsTo = [ Groups, Teacher ]
//    static belongsTo = [ Groups ]

    static hasMany = [
            lesson: Lesson
    ]

    static constraints = {
        firstName ( blank:false, maxSize:20, nullable:false )
        lastName ( blank:false, maxSize:20, nullable:false )
        dateOfBirth ( blank:false, nullable:false )
    }

    String toString () {
        "$lastName, $firstName"
    }
}
