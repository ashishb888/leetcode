package poc.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LeetCodeArrayService {

	@Autowired
	private DuplicateZeros dz;

	public void main() {
		log.debug("main service");

		dz.duplicateZeros(new int[] { 1, 0, 2, 3, 0, 4, 5, 0 });
	}
}
