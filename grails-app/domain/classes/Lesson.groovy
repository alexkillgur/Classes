package classes

class Lesson {
    String name
    String description
    Date dateOfLesson
    Integer hours
//    Teacher teacher
//    Scholar scholar

    static belongsTo = [ Teacher, Scholar ]
//    static hasMany = [
//            lesson: Scholar
//    ]

    static constraints = {
        name ( blank:false, maxSize:20, nullable:false )
        description ( blank:false, maxSize:1000, nullable:false )
        dateOfLesson ( blank:false, nullable:false )
        hours ( blank:false, maxSize:3, nullable:false )
    }

    String toString() {
        name
    }
}
