package com.app.tests;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HamcrestMatchersDemo {

    //hamcrest library provides matchers (assertion method)
    //rest assured uses hamcrest assertions (matchers)
    //works  with both junit and testng

    @Test
    public void  test(){
        assertThat(1, equalTo(1));
        String str1 = "Kunka";
        String str2 = "kunka";
        //verify if first argument is equal to second
        assertThat(str1, is("kunka"));
        assertThat(str1, is(str2));

        //verify if first argument is not equal to the second

        assertThat(str1, is(not("Tidehunter")));

        //compare ignoring case
        assertThat(str1, equalToIgnoringCase("Kunka"));

        //compare  ignoring space before and after
        assertThat(str1, equalToIgnoringWhiteSpace(" kunka "));

        //compare numbers
        assertThat(10, greaterThan(9));
        assertThat(10, lessThan(11));
        assertThat(10, lessThanOrEqualTo(11));


        //CMD+D duplicate line

        //verify not null
        assertThat(str1, notNullValue());

        List<String> list = Arrays.asList("one", "two", "tree");

        assertThat(list, Matchers.<String>hasSize(3));

        assertThat(list, containsInAnyOrder("two","tree","one"));

        assertThat(list, hasItems("one","two"));

        List<Integer>numbers = Arrays.asList(11, 12, 13);
        assertThat(numbers, everyItem(greaterThan(9)));

    }
}
