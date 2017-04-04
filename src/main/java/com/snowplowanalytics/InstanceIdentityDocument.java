
package com.snowplowanalytics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({
    "instanceId",
    "devpayProductCodes",
    "billingProducts",
    "availabilityZone",
    "accountId",
    "ramdiskId",
    "architecture",
    "instanceType",
    "version",
    "pendingTime",
    "imageId",
    "privateIp",
    "region",
    "kernelId"
})
@IgluInfo(vendor = "com.amazon.aws.ec2", name = "instance_identity_document", version = "1-0-0", format = "jsonschema")
public class InstanceIdentityDocument extends SelfDescribingJsonContext implements Serializable {

    @JsonProperty("instanceId")
    @Size(min = 10, max = 19)
    private String instanceId;
    @JsonProperty("devpayProductCodes")
    private List<String> devpayProductCodes = new ArrayList<String>();
    @JsonProperty("billingProducts")
    private List<String> billingProducts = new ArrayList<String>();
    @JsonProperty("availabilityZone")
    private String availabilityZone;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("ramdiskId")
    @Size(min = 12, max = 12)
    private String ramdiskId;
    @JsonProperty("architecture")
    private String architecture;
    @JsonProperty("instanceType")
    private String instanceType;
    @JsonProperty("version")
    private String version;
    @JsonProperty("pendingTime")
    private Date pendingTime;
    @JsonProperty("imageId")
    @Size(min = 12, max = 12)
    private String imageId;
    @JsonProperty("privateIp")
    @Size(min = 11, max = 15)
    private String privateIp;
    @JsonProperty("region")
    private String region;
    @JsonProperty("kernelId")
    @Size(min = 12, max = 12)
    private String kernelId;
    private final static long serialVersionUID = -1427556129101562683L;

    @JsonProperty("instanceId")
    public String getInstanceId() {
        return instanceId;
    }

    @JsonProperty("instanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceIdentityDocument withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    @JsonProperty("devpayProductCodes")
    public List<String> getDevpayProductCodes() {
        return devpayProductCodes;
    }

    @JsonProperty("devpayProductCodes")
    public void setDevpayProductCodes(List<String> devpayProductCodes) {
        this.devpayProductCodes = devpayProductCodes;
    }

    public InstanceIdentityDocument withDevpayProductCodes(List<String> devpayProductCodes) {
        this.devpayProductCodes = devpayProductCodes;
        return this;
    }

    @JsonProperty("billingProducts")
    public List<String> getBillingProducts() {
        return billingProducts;
    }

    @JsonProperty("billingProducts")
    public void setBillingProducts(List<String> billingProducts) {
        this.billingProducts = billingProducts;
    }

    public InstanceIdentityDocument withBillingProducts(List<String> billingProducts) {
        this.billingProducts = billingProducts;
        return this;
    }

    @JsonProperty("availabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    @JsonProperty("availabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public InstanceIdentityDocument withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public InstanceIdentityDocument withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    @JsonProperty("ramdiskId")
    public String getRamdiskId() {
        return ramdiskId;
    }

    @JsonProperty("ramdiskId")
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    public InstanceIdentityDocument withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    @JsonProperty("architecture")
    public String getArchitecture() {
        return architecture;
    }

    @JsonProperty("architecture")
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public InstanceIdentityDocument withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    @JsonProperty("instanceType")
    public String getInstanceType() {
        return instanceType;
    }

    @JsonProperty("instanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public InstanceIdentityDocument withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public InstanceIdentityDocument withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("pendingTime")
    public Date getPendingTime() {
        return pendingTime;
    }

    @JsonProperty("pendingTime")
    public void setPendingTime(Date pendingTime) {
        this.pendingTime = pendingTime;
    }

    public InstanceIdentityDocument withPendingTime(Date pendingTime) {
        this.pendingTime = pendingTime;
        return this;
    }

    @JsonProperty("imageId")
    public String getImageId() {
        return imageId;
    }

    @JsonProperty("imageId")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public InstanceIdentityDocument withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    @JsonProperty("privateIp")
    public String getPrivateIp() {
        return privateIp;
    }

    @JsonProperty("privateIp")
    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public InstanceIdentityDocument withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public InstanceIdentityDocument withRegion(String region) {
        this.region = region;
        return this;
    }

    @JsonProperty("kernelId")
    public String getKernelId() {
        return kernelId;
    }

    @JsonProperty("kernelId")
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    public InstanceIdentityDocument withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(instanceId).append(devpayProductCodes).append(billingProducts).append(availabilityZone).append(accountId).append(ramdiskId).append(architecture).append(instanceType).append(version).append(pendingTime).append(imageId).append(privateIp).append(region).append(kernelId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstanceIdentityDocument)) {
            return false;
        }
        InstanceIdentityDocument rhs = ((InstanceIdentityDocument) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(instanceId, rhs.instanceId).append(devpayProductCodes, rhs.devpayProductCodes).append(billingProducts, rhs.billingProducts).append(availabilityZone, rhs.availabilityZone).append(accountId, rhs.accountId).append(ramdiskId, rhs.ramdiskId).append(architecture, rhs.architecture).append(instanceType, rhs.instanceType).append(version, rhs.version).append(pendingTime, rhs.pendingTime).append(imageId, rhs.imageId).append(privateIp, rhs.privateIp).append(region, rhs.region).append(kernelId, rhs.kernelId).isEquals();
    }

}
