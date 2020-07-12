package com.shohidulhaque.whatdoyouthinkauthorizationservice

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class SampleSpecTest extends Specification {

    def "two plus two should equal four"() {
        given:
        int left = 2
        int right = 2
        when:
        int result = left + right
        then:
        result == 4
    }

}