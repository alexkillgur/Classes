import classes.Audience
import classes.Gr
import classes.Lesson
import classes.Scholar
import classes.Guru

class BootStrap {

    def init = { servletContext ->

        Audience a1, a2
        Lesson l1, l2
        Scholar s1, s2
        Guru t1, t2
        Gr g1, g2

        if ( !Audience.count() ) {
            a1 = new Audience ( name: "Laboratory 1", description: "bum", housing: 1, floor: 2 ).save( failOnError: true )
            a2 = new Audience ( name: "Laboratory 2", description: "bah", housing: 2, floor: 1 ).save( failOnError: true )
        }

        if ( !Lesson.count() ) {
            l1 = new Lesson ( name: "Mathematics", description: "some descriptions", dateOfLesson: new Date().parse( "yyyy.MM.dd",'2016.01.01' ), hours: 148 ).save( failOnError: true )
            l2 = new Lesson ( name: "Groovy", description: "some descriptions", dateOfLesson: new Date().parse( "yyyy.MM.dd",'2016.01.01' ), hours: 156 ).save( failOnError: true )
        }

        if ( !Scholar.count() ) {
            s1 = new Scholar ( firstName: "Alex", lastName: "Killgur", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1981.04.09' ), lesson: l1 ).save( failOnError: true )
            s2 = new Scholar ( firstName: "Killgur", lastName: "Alex", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1981.04.09' ), lesson: l2 ).save( failOnError: true )
//            s1 = new Scholar ( firstName: "Alex", lastName: "Killgur", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1981.04.09' ) ).save( failOnError: true )
//            s2 = new Scholar ( firstName: "Killgur", lastName: "Alex", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1981.04.09' ) ).save( failOnError: true )
        }

        if ( !Guru.count() ) {
            t1 = new Guru ( firstName: "Max", lastName: "Mad", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1981.04.09' ), lesson: l1, audience: a1, scholar: s2 ).save( failOnError: true )
            t2 = new Guru ( firstName: "Mad", lastName: "Max", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1981.04.09' ), lesson: l2, audience: a2, scholar: s1 ).save( failOnError: true )
//            t1 = new Guru ( firstName: "Max", lastName: "Mad", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1972.04.09' ) ).save( failOnError: true )
//            t2 = new Guru ( firstName: "Mad", lastName: "Max", dateOfBirth: new Date().parse( "yyyy.MM.dd",'1972.04.09' ) ).save( failOnError: true )
        }

        if ( !Gr.count() ) {
            g1 = new Gr ( name: "KM-83", course: "Computer Science", scholar: s1, audience: a2 ).save( failOnError: true )
            g2 = new Gr ( name: "RM-84", course: "Computer Science", scholar: s2, audience: a1 ).save( failOnError: true )
        }
    }

    def destroy = {
    }
}
