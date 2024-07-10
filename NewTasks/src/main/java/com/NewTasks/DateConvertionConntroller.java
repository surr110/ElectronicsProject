package com.NewTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateConvertionConntroller {
 
@GetMapping(value="/convertdate/{datestr}") 
 public String getdate(@PathVariable String datestr) {
 
 try {
 DateTimeFormatter inputdate=DateTimeFormatter.ofPattern("dd MMMM,yyyy",Locale.ENGLISH);
 DateTimeFormatter outputdate=DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
 
 LocalDate date=LocalDate.parse(datestr,inputdate);
 return date.format(outputdate);
 
 
 } 
 catch(DateTimeParseException e) {
  return "invalid data format";
  
 }
 
}
}


