package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CreateBucketRequest;

@SpringBootApplication
public class CreateS3BucketApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CreateS3BucketApplication.class, args);
		BasicAWSCredentials credential=new BasicAWSCredentials("AKIAQ5QRIF3ITPIGEAV4", "BJEOrnZHr7FhdU7vba5WouLmLmwGu1H8mqCx0bh9");
//		AmazonS3 s3=AmazonS3ClientBuilder.standard().
//				withCredentials(new AWSStaticCredentialsProvider(credential))
//				.withRegion(Regions.US_EAST_2).build();
//		String bucketName="test-amar";
//		if(s3.doesBucketExist(bucketName))
//		{
//		s3.createBucket(bucketName);
//		}
		 Regions clientRegion = Regions.DEFAULT_REGION;
	        String bucketName = "test-amar-bucket";

	        try {
	            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
	                    .withCredentials(new AWSStaticCredentialsProvider(credential))
	                    .withRegion(clientRegion)
	                    .build();

	            if (!s3Client.doesBucketExistV2(bucketName)) {
	                // Because the CreateBucketRequest object doesn't specify a region, the
	                // bucket is created in the region specified in the client.
	                s3Client.createBucket(new CreateBucketRequest(bucketName));
	}
	            System.out.println(s3Client.);

}
	        catch (Exception e) {
				// TODO: handle exception
			}
	}
}
