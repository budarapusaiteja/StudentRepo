package com.sample.sampledata;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	MyInterface mi;
	@GetMapping(value="/getAll")
	public List<StudentTable> getAllRecords() {
		return mi.findAll();
	}
	
	@GetMapping(value="/SortBy/{field}")
	public List<StudentTable> sort(@PathVariable String field){
		return mi.findAll(Sort.by(Direction.ASC,field));
	}
	@GetMapping(value="GetBy/{id}")
	public Optional<StudentTable> get(@PathVariable Integer id) {
		return mi.findById(id);
	}
	@GetMapping(value="SetMarks/{id}/{marks}")
	public Optional<StudentTable> set(@PathVariable Integer id,@PathVariable double marks) {
		StudentTable st=mi.findById(id).get();
		st.setMarks(marks);
		return mi.findById(id);
	}
	
}
