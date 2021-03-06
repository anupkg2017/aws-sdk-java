/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The message configuration.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectMessageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /** The message to APNS channels. Overrides the default push notification message. */
    private APNSMessage aPNSMessage;
    /** The message to Baidu GCM channels. Overrides the default push notification message. */
    private BaiduMessage baiduMessage;
    /** The default message for all channels. */
    private DefaultMessage defaultMessage;
    /** The default push notification message for all push channels. */
    private DefaultPushNotificationMessage defaultPushNotificationMessage;
    /** The message to GCM channels. Overrides the default push notification message. */
    private GCMMessage gCMMessage;
    /** The message to SMS channels. Overrides the default message. */
    private SMSMessage sMSMessage;

    /**
     * The message to APNS channels. Overrides the default push notification message.
     * 
     * @param aPNSMessage
     *        The message to APNS channels. Overrides the default push notification message.
     */

    public void setAPNSMessage(APNSMessage aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * The message to APNS channels. Overrides the default push notification message.
     * 
     * @return The message to APNS channels. Overrides the default push notification message.
     */

    public APNSMessage getAPNSMessage() {
        return this.aPNSMessage;
    }

    /**
     * The message to APNS channels. Overrides the default push notification message.
     * 
     * @param aPNSMessage
     *        The message to APNS channels. Overrides the default push notification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withAPNSMessage(APNSMessage aPNSMessage) {
        setAPNSMessage(aPNSMessage);
        return this;
    }

    /**
     * The message to Baidu GCM channels. Overrides the default push notification message.
     * 
     * @param baiduMessage
     *        The message to Baidu GCM channels. Overrides the default push notification message.
     */

    public void setBaiduMessage(BaiduMessage baiduMessage) {
        this.baiduMessage = baiduMessage;
    }

    /**
     * The message to Baidu GCM channels. Overrides the default push notification message.
     * 
     * @return The message to Baidu GCM channels. Overrides the default push notification message.
     */

    public BaiduMessage getBaiduMessage() {
        return this.baiduMessage;
    }

    /**
     * The message to Baidu GCM channels. Overrides the default push notification message.
     * 
     * @param baiduMessage
     *        The message to Baidu GCM channels. Overrides the default push notification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withBaiduMessage(BaiduMessage baiduMessage) {
        setBaiduMessage(baiduMessage);
        return this;
    }

    /**
     * The default message for all channels.
     * 
     * @param defaultMessage
     *        The default message for all channels.
     */

    public void setDefaultMessage(DefaultMessage defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * The default message for all channels.
     * 
     * @return The default message for all channels.
     */

    public DefaultMessage getDefaultMessage() {
        return this.defaultMessage;
    }

    /**
     * The default message for all channels.
     * 
     * @param defaultMessage
     *        The default message for all channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withDefaultMessage(DefaultMessage defaultMessage) {
        setDefaultMessage(defaultMessage);
        return this;
    }

    /**
     * The default push notification message for all push channels.
     * 
     * @param defaultPushNotificationMessage
     *        The default push notification message for all push channels.
     */

    public void setDefaultPushNotificationMessage(DefaultPushNotificationMessage defaultPushNotificationMessage) {
        this.defaultPushNotificationMessage = defaultPushNotificationMessage;
    }

    /**
     * The default push notification message for all push channels.
     * 
     * @return The default push notification message for all push channels.
     */

    public DefaultPushNotificationMessage getDefaultPushNotificationMessage() {
        return this.defaultPushNotificationMessage;
    }

    /**
     * The default push notification message for all push channels.
     * 
     * @param defaultPushNotificationMessage
     *        The default push notification message for all push channels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withDefaultPushNotificationMessage(DefaultPushNotificationMessage defaultPushNotificationMessage) {
        setDefaultPushNotificationMessage(defaultPushNotificationMessage);
        return this;
    }

    /**
     * The message to GCM channels. Overrides the default push notification message.
     * 
     * @param gCMMessage
     *        The message to GCM channels. Overrides the default push notification message.
     */

    public void setGCMMessage(GCMMessage gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * The message to GCM channels. Overrides the default push notification message.
     * 
     * @return The message to GCM channels. Overrides the default push notification message.
     */

    public GCMMessage getGCMMessage() {
        return this.gCMMessage;
    }

    /**
     * The message to GCM channels. Overrides the default push notification message.
     * 
     * @param gCMMessage
     *        The message to GCM channels. Overrides the default push notification message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withGCMMessage(GCMMessage gCMMessage) {
        setGCMMessage(gCMMessage);
        return this;
    }

    /**
     * The message to SMS channels. Overrides the default message.
     * 
     * @param sMSMessage
     *        The message to SMS channels. Overrides the default message.
     */

    public void setSMSMessage(SMSMessage sMSMessage) {
        this.sMSMessage = sMSMessage;
    }

    /**
     * The message to SMS channels. Overrides the default message.
     * 
     * @return The message to SMS channels. Overrides the default message.
     */

    public SMSMessage getSMSMessage() {
        return this.sMSMessage;
    }

    /**
     * The message to SMS channels. Overrides the default message.
     * 
     * @param sMSMessage
     *        The message to SMS channels. Overrides the default message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectMessageConfiguration withSMSMessage(SMSMessage sMSMessage) {
        setSMSMessage(sMSMessage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAPNSMessage() != null)
            sb.append("APNSMessage: ").append(getAPNSMessage()).append(",");
        if (getBaiduMessage() != null)
            sb.append("BaiduMessage: ").append(getBaiduMessage()).append(",");
        if (getDefaultMessage() != null)
            sb.append("DefaultMessage: ").append(getDefaultMessage()).append(",");
        if (getDefaultPushNotificationMessage() != null)
            sb.append("DefaultPushNotificationMessage: ").append(getDefaultPushNotificationMessage()).append(",");
        if (getGCMMessage() != null)
            sb.append("GCMMessage: ").append(getGCMMessage()).append(",");
        if (getSMSMessage() != null)
            sb.append("SMSMessage: ").append(getSMSMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectMessageConfiguration == false)
            return false;
        DirectMessageConfiguration other = (DirectMessageConfiguration) obj;
        if (other.getAPNSMessage() == null ^ this.getAPNSMessage() == null)
            return false;
        if (other.getAPNSMessage() != null && other.getAPNSMessage().equals(this.getAPNSMessage()) == false)
            return false;
        if (other.getBaiduMessage() == null ^ this.getBaiduMessage() == null)
            return false;
        if (other.getBaiduMessage() != null && other.getBaiduMessage().equals(this.getBaiduMessage()) == false)
            return false;
        if (other.getDefaultMessage() == null ^ this.getDefaultMessage() == null)
            return false;
        if (other.getDefaultMessage() != null && other.getDefaultMessage().equals(this.getDefaultMessage()) == false)
            return false;
        if (other.getDefaultPushNotificationMessage() == null ^ this.getDefaultPushNotificationMessage() == null)
            return false;
        if (other.getDefaultPushNotificationMessage() != null
                && other.getDefaultPushNotificationMessage().equals(this.getDefaultPushNotificationMessage()) == false)
            return false;
        if (other.getGCMMessage() == null ^ this.getGCMMessage() == null)
            return false;
        if (other.getGCMMessage() != null && other.getGCMMessage().equals(this.getGCMMessage()) == false)
            return false;
        if (other.getSMSMessage() == null ^ this.getSMSMessage() == null)
            return false;
        if (other.getSMSMessage() != null && other.getSMSMessage().equals(this.getSMSMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAPNSMessage() == null) ? 0 : getAPNSMessage().hashCode());
        hashCode = prime * hashCode + ((getBaiduMessage() == null) ? 0 : getBaiduMessage().hashCode());
        hashCode = prime * hashCode + ((getDefaultMessage() == null) ? 0 : getDefaultMessage().hashCode());
        hashCode = prime * hashCode + ((getDefaultPushNotificationMessage() == null) ? 0 : getDefaultPushNotificationMessage().hashCode());
        hashCode = prime * hashCode + ((getGCMMessage() == null) ? 0 : getGCMMessage().hashCode());
        hashCode = prime * hashCode + ((getSMSMessage() == null) ? 0 : getSMSMessage().hashCode());
        return hashCode;
    }

    @Override
    public DirectMessageConfiguration clone() {
        try {
            return (DirectMessageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.DirectMessageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
