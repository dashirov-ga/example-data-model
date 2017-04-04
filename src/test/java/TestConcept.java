import com.snowplowanalytics.InstanceIdentityDocument;

/**
 * Created by dashirov on 4/1/17.
 */
public class TestConcept {
    public static void main(String[] arg){
        InstanceIdentityDocument iid =
                new InstanceIdentityDocument()
                        .withAccountId("Account# 12345")
                        .withArchitecture("Architecture")
                        .withAvailabilityZone("us-east-1e");
        iid.getSelfDescribingJson();



    }
}
