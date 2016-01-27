package classes

class Audience {
    String name
    String description
    Integer housing
    Integer floor
//    Teacher teacher
//    Groups group

    static belongsTo = [ Groups, Teacher]
//    static belongsTo = [ Teacher]

    static constraints = {
        name ( blank:false, maxSize:20, nullable:false )
        description ( blank:false, maxSize:1000, nullable:false )
        housing ( blank:false, maxSize:2, nullable:false )
        floor ( blank:false, maxSize:3, nullable:false )
    }

    String toString() {
        name
    }
}
