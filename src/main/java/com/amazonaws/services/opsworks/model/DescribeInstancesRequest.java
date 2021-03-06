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
package com.amazonaws.services.opsworks.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeInstances(DescribeInstancesRequest) DescribeInstances operation}.
 * <p>
 * Requests a description of a set of instances associated with a specified ID or IDs.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeInstances(DescribeInstancesRequest)
 */
public class DescribeInstancesRequest extends AmazonWebServiceRequest {

    /**
     * A stack ID.
     */
    private String stackId;

    /**
     * A layer ID.
     */
    private String layerId;

    /**
     * An app ID.
     */
    private String appId;

    /**
     * An array of instance IDs to be described.
     */
    private java.util.List<String> instanceIds;

    /**
     * A stack ID.
     *
     * @return A stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * A stack ID.
     *
     * @param stackId A stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * A stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId A stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    
    
    /**
     * A layer ID.
     *
     * @return A layer ID.
     */
    public String getLayerId() {
        return layerId;
    }
    
    /**
     * A layer ID.
     *
     * @param layerId A layer ID.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    /**
     * A layer ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerId A layer ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }
    
    
    /**
     * An app ID.
     *
     * @return An app ID.
     */
    public String getAppId() {
        return appId;
    }
    
    /**
     * An app ID.
     *
     * @param appId An app ID.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    /**
     * An app ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appId An app ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }
    
    
    /**
     * An array of instance IDs to be described.
     *
     * @return An array of instance IDs to be described.
     */
    public java.util.List<String> getInstanceIds() {
        
        if (instanceIds == null) {
            instanceIds = new java.util.ArrayList<String>();
        }
        return instanceIds;
    }
    
    /**
     * An array of instance IDs to be described.
     *
     * @param instanceIds An array of instance IDs to be described.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * An array of instance IDs to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An array of instance IDs to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of instance IDs to be described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An array of instance IDs to be described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ", ");
        if (getLayerId() != null) sb.append("LayerId: " + getLayerId() + ", ");
        if (getAppId() != null) sb.append("AppId: " + getAppId() + ", ");
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode()); 
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstancesRequest == false) return false;
        DescribeInstancesRequest other = (DescribeInstancesRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerId() == null ^ this.getLayerId() == null) return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false) return false; 
        if (other.getAppId() == null ^ this.getAppId() == null) return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false) return false; 
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        return true;
    }
    
}
    