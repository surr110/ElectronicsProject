package com.NewTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@GetMapping("/getdate")
	public String getdate(@RequestParam String date, @RequestParam String fromFormat, @RequestParam String toFormat) {
		try {
			DateTimeFormatter fromFormatter = DateTimeFormatter.ofPattern(fromFormat);
			LocalDate parsedDate = LocalDate.parse(date, fromFormatter);
			DateTimeFormatter toFormatter = DateTimeFormatter.ofPattern(toFormat);
			return parsedDate.format(toFormatter);
		} catch (DateTimeParseException e) {
			return "Invaild Data";

		}

	}

}
