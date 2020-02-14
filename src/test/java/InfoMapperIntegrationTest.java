//import com.example.config.PersistenceConfig;
//import com.example.mapper.InfoMapper;
//import com.example.model.Info;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = PersistenceConfig.class)
//public class InfoMapperIntegrationTest {
//
//    @Autowired
//    InfoMapper infoMapper;
//
//    @Test
//    public void whenRecordsInDatabase_shouldReturnArticleWithGivenId() {
//        Info info= InfoMapper.findAll();
//
//        assertThat(info).isNotNull();
//        assertThat(info.getId()).isEqualTo(1);
//        assertThat(info.getInfo()).isEqualTo("Hello World");
//    }
//}
