/*
 * Copyright (c) 2018, FCPY Studio.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fcpy.aws.course.developing.dynamodb;

import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;

public class Utils {

  public static final String LAB_S3_BUCKET_NAME = "us-west-2-aws-staging";
  public static final String LAB_S3_BUCKET_REGION = "us-west-2";
  public static final String INFECTIONS_DATA_FILE_KEY =
      "awsu-ilt/AWS-100-DEV/v2.2/binaries/input/lab-3-dynamoDB/InfectionsData.csv";
  public static final String PATIENT_REPORT_PREFIX =
      "awsu-ilt/AWS-100-DEV/v2.2/binaries/input/lab-3-dynamoDB/PatientRecord";

  public static Region getRegion() {
    Region region = Regions.getCurrentRegion();

    // For local testing only
    if (region == null) {
      region = Region.getRegion(Regions.US_WEST_1);
    }

    System.out.println("getRegion returns " + region.getName());
    return region;
  }
}
