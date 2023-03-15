package test.bean_factory_post_processor;

import lombok.Data;

@Data
public class SimplePostProcessor {
	private String connectionString;
	private String password;
	private String username;
}
