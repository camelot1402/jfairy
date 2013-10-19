package eu.codearte.fairyland.producer

import eu.codearte.fairyland.Fairy
import eu.codearte.fairyland.producer.person.Person
import spock.lang.Ignore
import spock.lang.Specification

class PersonSpec extends Specification {
    def "should instantiate Person producer"() {
        when:
        def person = Fairy.create().produce(Person.class)
        then:
        person instanceof Person
    }

    def "should instantiate PersonProducer producer with person"() {
        when:
        def person = Fairy.create().person()
        then:
        person instanceof Person
    }

    def "should be sure that fullName is proper"() {
        when:
        def person = Fairy.create().person()
        then:
        person.email()
        "${person.firstName()} ${person.lastName()}" == person.fullName()
    }

    @Ignore
    def "second generated name should be different"() {
        setup:
        def fairy = Fairy.create()
        expect:
        fairy.person().firstName() != fairy.person().firstName()
    }

    def "should be sure that data exists"() {
        when:
        def person = Fairy.create().person()
        then:
        person.firstName()
        person.lastName()
        person.fullName()
        person.email()
        person.isMale() || person.isFemale()
    }

    def "should create women"() {
        when:
        def person = Fairy.create().women()
        then:
        person.isFemale()
    }

    def "should create men"() {
        when:
        def person = Fairy.create().men()
        then:
        person.isMale()
    }

    def "should create female"() {
        when:
        def person = Fairy.create().person().female()
        then:
        person.isFemale()
    }

    def "should create male"() {
        when:
        def person = Fairy.create().person().male()
        then:
        person.isMale()
    }

    def "should create telephone number"() {
        when:
        def person = Fairy.create().person()
        then:
        person.telephoneNumber()
    }

    def "should create telephone number in defined format"() {
        when:
        def person = Fairy.create().person().telephoneNumberFormat("###--###")
        then:
        person.telephoneNumber() ==~ /\d\d\d--\d\d\d/
    }
}
