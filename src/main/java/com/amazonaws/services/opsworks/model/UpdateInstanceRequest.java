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
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#updateInstance(UpdateInstanceRequest) UpdateInstance operation}.
 * <p>
 * Updates a specified instance.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#updateInstance(UpdateInstanceRequest)
 */
public class UpdateInstanceRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The instance's layer IDs.
     */
    private java.util.List<String> layerIds;

    /**
     * The instance type, which can be one of the following: <ul>
     * <li>m1.small</li> <li>m1.medium</li> <li>m1.large</li>
     * <li>m1.xlarge</li> <li>c1.medium</li> <li>c1.xlarge</li>
     * <li>m2.xlarge</li> <li>m2.2xlarge</li> <li>m2.4xlarge</li> </ul>
     */
    private String instanceType;

    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AlwaysRunning, TimeBasedAutoScaling, LoadBasedAutoScaling
     */
    private String autoScalingType;

    /**
     * The instance host name.
     */
    private String hostname;

    /**
     * The instance operating system.
     */
    private String os;

    /**
     * The instance SSH key name.
     */
    private String sshKeyName;

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The instance's layer IDs.
     *
     * @return The instance's layer IDs.
     */
    public java.util.List<String> getLayerIds() {
        
        if (layerIds == null) {
            layerIds = new java.util.ArrayList<String>();
        }
        return layerIds;
    }
    
    /**
     * The instance's layer IDs.
     *
     * @param layerIds The instance's layer IDs.
     */
    public void setLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
            return;
        }

        java.util.List<String> layerIdsCopy = new java.util.ArrayList<String>(layerIds.size());
        layerIdsCopy.addAll(layerIds);
        this.layerIds = layerIdsCopy;
    }
    
    /**
     * The instance's layer IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds The instance's layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateInstanceRequest withLayerIds(String... layerIds) {
        if (getLayerIds() == null) setLayerIds(new java.util.ArrayList<String>(layerIds.length));
        for (String value : layerIds) {
            getLayerIds().add(value);
        }
        return this;
    }
    
    /**
     * The instance's layer IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerIds The instance's layer IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateInstanceRequest withLayerIds(java.util.Collection<String> layerIds) {
        if (layerIds == null) {
            this.layerIds = null;
        } else {
            java.util.List<String> layerIdsCopy = new java.util.ArrayList<String>(layerIds.size());
            layerIdsCopy.addAll(layerIds);
            this.layerIds = layerIdsCopy;
        }

        return this;
    }
    
    /**
     * The instance type, which can be one of the following: <ul>
     * <li>m1.small</li> <li>m1.medium</li> <li>m1.large</li>
     * <li>m1.xlarge</li> <li>c1.medium</li> <li>c1.xlarge</li>
     * <li>m2.xlarge</li> <li>m2.2xlarge</li> <li>m2.4xlarge</li> </ul>
     *
     * @return The instance type, which can be one of the following: <ul>
     *         <li>m1.small</li> <li>m1.medium</li> <li>m1.large</li>
     *         <li>m1.xlarge</li> <li>c1.medium</li> <li>c1.xlarge</li>
     *         <li>m2.xlarge</li> <li>m2.2xlarge</li> <li>m2.4xlarge</li> </ul>
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type, which can be one of the following: <ul>
     * <li>m1.small</li> <li>m1.medium</li> <li>m1.large</li>
     * <li>m1.xlarge</li> <li>c1.medium</li> <li>c1.xlarge</li>
     * <li>m2.xlarge</li> <li>m2.2xlarge</li> <li>m2.4xlarge</li> </ul>
     *
     * @param instanceType The instance type, which can be one of the following: <ul>
     *         <li>m1.small</li> <li>m1.medium</li> <li>m1.large</li>
     *         <li>m1.xlarge</li> <li>c1.medium</li> <li>c1.xlarge</li>
     *         <li>m2.xlarge</li> <li>m2.2xlarge</li> <li>m2.4xlarge</li> </ul>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type, which can be one of the following: <ul>
     * <li>m1.small</li> <li>m1.medium</li> <li>m1.large</li>
     * <li>m1.xlarge</li> <li>c1.medium</li> <li>c1.xlarge</li>
     * <li>m2.xlarge</li> <li>m2.2xlarge</li> <li>m2.4xlarge</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type, which can be one of the following: <ul>
     *         <li>m1.small</li> <li>m1.medium</li> <li>m1.large</li>
     *         <li>m1.xlarge</li> <li>c1.medium</li> <li>c1.xlarge</li>
     *         <li>m2.xlarge</li> <li>m2.2xlarge</li> <li>m2.4xlarge</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateInstanceRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AlwaysRunning, TimeBasedAutoScaling, LoadBasedAutoScaling
     *
     * @return The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @see AutoScalingType
     */
    public String getAutoScalingType() {
        return autoScalingType;
    }
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AlwaysRunning, TimeBasedAutoScaling, LoadBasedAutoScaling
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
    }
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AlwaysRunning, TimeBasedAutoScaling, LoadBasedAutoScaling
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AutoScalingType
     */
    public UpdateInstanceRequest withAutoScalingType(String autoScalingType) {
        this.autoScalingType = autoScalingType;
        return this;
    }
    
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AlwaysRunning, TimeBasedAutoScaling, LoadBasedAutoScaling
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @see AutoScalingType
     */
    public void setAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
    }
    
    /**
     * The instance's auto scaling type, which has three possible values:
     * <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     * by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     * auto scaling instance, which is started and stopped based on a
     * specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     * auto scaling instance, which is started and stopped based on load
     * metrics.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AlwaysRunning, TimeBasedAutoScaling, LoadBasedAutoScaling
     *
     * @param autoScalingType The instance's auto scaling type, which has three possible values:
     *         <ul> <li><b>AlwaysRunning</b>: A 24x7 instance, which is not affected
     *         by auto scaling.</li> <li><b>TimeBasedAutoScaling</b>: A time-based
     *         auto scaling instance, which is started and stopped based on a
     *         specified schedule.</li> <li><b>LoadBasedAutoScaling</b>: A load-based
     *         auto scaling instance, which is started and stopped based on load
     *         metrics.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AutoScalingType
     */
    public UpdateInstanceRequest withAutoScalingType(AutoScalingType autoScalingType) {
        this.autoScalingType = autoScalingType.toString();
        return this;
    }
    
    /**
     * The instance host name.
     *
     * @return The instance host name.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The instance host name.
     *
     * @param hostname The instance host name.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The instance host name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostname The instance host name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateInstanceRequest withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    
    
    /**
     * The instance operating system.
     *
     * @return The instance operating system.
     */
    public String getOs() {
        return os;
    }
    
    /**
     * The instance operating system.
     *
     * @param os The instance operating system.
     */
    public void setOs(String os) {
        this.os = os;
    }
    
    /**
     * The instance operating system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param os The instance operating system.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateInstanceRequest withOs(String os) {
        this.os = os;
        return this;
    }
    
    
    /**
     * The instance SSH key name.
     *
     * @return The instance SSH key name.
     */
    public String getSshKeyName() {
        return sshKeyName;
    }
    
    /**
     * The instance SSH key name.
     *
     * @param sshKeyName The instance SSH key name.
     */
    public void setSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
    }
    
    /**
     * The instance SSH key name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshKeyName The instance SSH key name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateInstanceRequest withSshKeyName(String sshKeyName) {
        this.sshKeyName = sshKeyName;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ", ");
        if (getLayerIds() != null) sb.append("LayerIds: " + getLayerIds() + ", ");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ", ");
        if (getAutoScalingType() != null) sb.append("AutoScalingType: " + getAutoScalingType() + ", ");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() + ", ");
        if (getOs() != null) sb.append("Os: " + getOs() + ", ");
        if (getSshKeyName() != null) sb.append("SshKeyName: " + getSshKeyName() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerIds() == null) ? 0 : getLayerIds().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingType() == null) ? 0 : getAutoScalingType().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        hashCode = prime * hashCode + ((getOs() == null) ? 0 : getOs().hashCode()); 
        hashCode = prime * hashCode + ((getSshKeyName() == null) ? 0 : getSshKeyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateInstanceRequest == false) return false;
        UpdateInstanceRequest other = (UpdateInstanceRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getLayerIds() == null ^ this.getLayerIds() == null) return false;
        if (other.getLayerIds() != null && other.getLayerIds().equals(this.getLayerIds()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAutoScalingType() == null ^ this.getAutoScalingType() == null) return false;
        if (other.getAutoScalingType() != null && other.getAutoScalingType().equals(this.getAutoScalingType()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        if (other.getOs() == null ^ this.getOs() == null) return false;
        if (other.getOs() != null && other.getOs().equals(this.getOs()) == false) return false; 
        if (other.getSshKeyName() == null ^ this.getSshKeyName() == null) return false;
        if (other.getSshKeyName() != null && other.getSshKeyName().equals(this.getSshKeyName()) == false) return false; 
        return true;
    }
    
}
    