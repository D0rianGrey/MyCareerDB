import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Consumer;

public class test {
    public static void main(String[] args) throws IOException {
//        String s = "a:23: {s: 6: \"crm_id\";i: 50394;s: 4: \"name\";s: 27: \"Test Apprenticeship Vacancy\";s: 11: \"description\";N;s: 14: \"job_profile_id\";s: 8: \"JC000067\";s: 16: \"job_profile_name\";s: 25: \"Trainee Software Engineer\";s: 16: \"management_level\";i: 0;s: 13: \"job_family_id\";s: 4: \".NET\";s: 15: \"job_family_name\";s: 4: \".NET\";s: 19: \"job_family_group_id\";s: 23: \"Application Engineering\";s: 21: \"job_family_group_name\";s: 23: \"Application Engineering\";s: 25: \"requester_organization_id\";i: 102;s: 27: \"requester_organization_name\";s: 9: \"SD Office\";s: 17: \"hiring_manager_id\";i: 6564;s: 24: \"hiring_manager_full_name\";s: 15: \"Mykola Lashchuk\";s: 12: \"locations_id\";a: 1: {i: 0;i: 109;}s: 14: \"locations_name\";a: 1: {i: 0;s: 8: \"Montreal\";}s: 19: \"locations_is_target\";a: 1: {i: 0;b: 1;}s: 12: \"recruiter_id\";i: 6564;s: 10: \"account_id\";i: 236;s: 12: \"account_name\";s: 6: \"Tomato\";s: 9: \"status_id\";i: 6;s: 11: \"status_name\";s: 20: \"Candidate Identified\";\n" +
//                "s: 11: \"search_type\";s: 8: \"External\";}";


        //String[] s1 = s.split("s:");
//        String[] s3 = s.split(",");
//
//        for (String value : s3) {
//            System.out.println(value);
//        }

        //Arrays.stream(s1).forEach(System.out::println);

        String s = "s:212521:\"{\"SourceSystemID\":\"MyCareer:10279\",\"SourceSystem\":\"My Career\",\"FirstName\":\"EugeneRegress\",\"LastName\":\"VakerinRegress\",\"Email\":\"regress@stage.ua\",\"Phone\":\"+38(050)-631-32-13\",\"ConsentRequestDate\":\"2021-01-04T16:26:58+02:00\",\"ConsentSubmitDate\":\"2021-01-04T16:26:58+02:00\",\"ConsentPolicyRead\":true,\"ConsentDataProcessing\":true,\"ConsentMarketingNotifications\":true,\"VacancyID\":57603,\"VacancyLink\":\"https:\\/\\/career-stage.softserveinc.com\\/vacancy\\/middle-net-software-engineer-44010\",\"VacancyRecruiterEmployeeID\":131529,\"InfoSource\":\"DOU\",\"CampaignID\":111,\"CampaignName\":\"campaign-name1\",\"CampaignTrackingCookieSetDate\":\"2021-01-04T16:25:47+02:00\",\"ProcessingSLA\":5,\"AttachmentFileName\":\"1609770418.pdf\"";

        String[] s1 = s.split(",");
        Arrays.stream(s1).forEach(x -> System.out.println(x));

    }
}


