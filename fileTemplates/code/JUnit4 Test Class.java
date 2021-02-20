import static org.junit.Assert.*;
#parse("File Header.java")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ${NAME} {

  private final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass().getName());
  
  @Autowired
  private ${CLASS_NAME} test;
  
  ${BODY}
}