package com.example.gitstudy2.Filter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFilterTest {
    private static ListFilter filter;
    private static List<Integer> target;

    @BeforeAll
    static void setup() {
        filter = new ListFilter();
        target = new ArrayList<>();

        createMocdata();
    }

    private static void createMocdata() {
        for (int i = 0; i < 100; i++) {
            target.add(i + 1);
        }
    }

    @Test
    @DisplayName("from, to 를 입력받아서 필터링을 할 수 있다")
    void filter() {
        //given

        int from = 20;
        int to = 50;

        int expectedSize = to - from -1;
        //when
        List<Integer> result = filter.filterBy(target, from, to);

        //then
        assertEquals(expectedSize,result.size());
    }

    @Test
    @DisplayName("from이 to 보다 더 큰 경우에는 필터링을 할 수 없다")
    void filter_failed_when_from_is_greater_than_to() {
        // given


        int from = 50;
        int to = 20;

        // when
        assertThrows(RuntimeException.class, () -> {
            filter.filterBy(target, from, to);
        });
        // then
    }
}