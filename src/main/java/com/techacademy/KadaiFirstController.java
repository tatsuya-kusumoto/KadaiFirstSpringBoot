package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        int year = 0;
        int month = 0;
        int day = 0;
        Calendar calendar = Calendar.getInstance();

        year = Integer.parseInt(val1.substring(0, 4));
        month = Integer.parseInt(val1.substring(4, 6));
        day = Integer.parseInt(val1.substring(6, 8));
        calendar.set(year, month - 1, day);

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
        case Calendar.SUNDAY:
            return "実行結果：Sunday";
        case Calendar.MONDAY:
            return "実行結果：Monday";
        case Calendar.TUESDAY:
            return "実行結果：Tuesday";
        case Calendar.WEDNESDAY:
            return "実行結果：Wednesday";
        case Calendar.THURSDAY:
            return "実行結果：Thursday";
        case Calendar.FRIDAY:
            return "実行結果：Friday";
        case Calendar.SATURDAY:
            return "実行結果：Saturday";
        }
        return null;
    }

    @GetMapping("plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "実行結果：" + res;
    }

    @GetMapping("minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "実行結果：" + res;
    }

    @GetMapping("times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "実行結果：" + res;
    }

    @GetMapping("divide/{val1}/{val2}")
    public String calcDivde(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "実行結果：" + res;
    }
}
