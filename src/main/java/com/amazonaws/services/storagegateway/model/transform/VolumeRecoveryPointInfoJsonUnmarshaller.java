/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.storagegateway.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Volume Recovery Point Info JSON Unmarshaller
 */
public class VolumeRecoveryPointInfoJsonUnmarshaller implements Unmarshaller<VolumeRecoveryPointInfo, JsonUnmarshallerContext> {

    

    public VolumeRecoveryPointInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        VolumeRecoveryPointInfo volumeRecoveryPointInfo = new VolumeRecoveryPointInfo();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("VolumeARN", targetDepth)) {
                    context.nextToken();
                    volumeRecoveryPointInfo.setVolumeARN(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeSizeInBytes", targetDepth)) {
                    context.nextToken();
                    volumeRecoveryPointInfo.setVolumeSizeInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeUsageInBytes", targetDepth)) {
                    context.nextToken();
                    volumeRecoveryPointInfo.setVolumeUsageInBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VolumeRecoveryPointTime", targetDepth)) {
                    context.nextToken();
                    volumeRecoveryPointInfo.setVolumeRecoveryPointTime(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            

            token = context.nextToken();
        }
        
        return volumeRecoveryPointInfo;
    }

    private static VolumeRecoveryPointInfoJsonUnmarshaller instance;
    public static VolumeRecoveryPointInfoJsonUnmarshaller getInstance() {
        if (instance == null) instance = new VolumeRecoveryPointInfoJsonUnmarshaller();
        return instance;
    }
}
    