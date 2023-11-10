package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PerfectStackController {

	@GetMapping("/pop")
	public Integer pop() {

		PerfectStack perfectStack = new PerfectStack();

		return perfectStack.pop();
	}

	@GetMapping("/push")
	public void push(@RequestParam Integer item) {

		PerfectStack perfectStack = new PerfectStack();

		perfectStack.push(item);
	}
}
