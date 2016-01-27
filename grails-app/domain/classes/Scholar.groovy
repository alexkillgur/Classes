package classes

class Scholar {
    String firstName
    String lastName
    Date dateOfBirth
//    Guru teacher
//    Gr group

    static belongsTo = [ Gr, Guru ]
//    static belongsTo = [ Gr ]

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
