package JUnit4Printtokens;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ get_token_test.class, is_character_constant_test.class, is_comment_test.class, is_identifier_test.class,
		is_keyword_test.class, is_num_constant_test.class, is_special_symbol_test.class, is_string_constant_test.class,
		is_token_end_test.class, open_character_stream_test.class, open_token_stream_test.class,
		print_spec_symbol_test.class, print_token_test.class, token_type_test.class, main_test.class })

public class AllTests {

}
