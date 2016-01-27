package classes

class Audience {
    String name
    String description
    Integer housing
    Integer floor
//    Guru teacher
//    Gr group

    static belongsTo = [ Gr, Guru ]
//    static belongsTo = [ Guru]

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
