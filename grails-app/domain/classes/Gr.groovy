package classes

class Gr {
    String name
    String course

    static hasMany = [
            scholar: Scholar,
            audience: Audience
    ]

    static constraints = {
        name ( blank:false, maxSize:20, nullable:false )
        course ( blank:false, maxSize:20, nullable:false )
    }

    String toString() {
//        name
        "$name, $course"
    }
}
