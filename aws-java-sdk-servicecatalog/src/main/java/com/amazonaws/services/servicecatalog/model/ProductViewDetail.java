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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed product view information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProductViewDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductViewDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The summary metadata about the specified product view.
     * </p>
     */
    private ProductViewSummary productViewSummary;
    /**
     * <p>
     * Current status of the product.
     * </p>
     * <p>
     * <code>AVAILABLE</code> - Product is available for use.
     * </p>
     * <p>
     * <code>CREATING</code> - Creation of product started, not ready for use.
     * </p>
     * <p>
     * <code>FAILED</code> - Action on product failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ARN associated with the product.
     * </p>
     */
    private String productARN;
    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The summary metadata about the specified product view.
     * </p>
     * 
     * @param productViewSummary
     *        The summary metadata about the specified product view.
     */

    public void setProductViewSummary(ProductViewSummary productViewSummary) {
        this.productViewSummary = productViewSummary;
    }

    /**
     * <p>
     * The summary metadata about the specified product view.
     * </p>
     * 
     * @return The summary metadata about the specified product view.
     */

    public ProductViewSummary getProductViewSummary() {
        return this.productViewSummary;
    }

    /**
     * <p>
     * The summary metadata about the specified product view.
     * </p>
     * 
     * @param productViewSummary
     *        The summary metadata about the specified product view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewDetail withProductViewSummary(ProductViewSummary productViewSummary) {
        setProductViewSummary(productViewSummary);
        return this;
    }

    /**
     * <p>
     * Current status of the product.
     * </p>
     * <p>
     * <code>AVAILABLE</code> - Product is available for use.
     * </p>
     * <p>
     * <code>CREATING</code> - Creation of product started, not ready for use.
     * </p>
     * <p>
     * <code>FAILED</code> - Action on product failed.
     * </p>
     * 
     * @param status
     *        Current status of the product.</p>
     *        <p>
     *        <code>AVAILABLE</code> - Product is available for use.
     *        </p>
     *        <p>
     *        <code>CREATING</code> - Creation of product started, not ready for use.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Action on product failed.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the product.
     * </p>
     * <p>
     * <code>AVAILABLE</code> - Product is available for use.
     * </p>
     * <p>
     * <code>CREATING</code> - Creation of product started, not ready for use.
     * </p>
     * <p>
     * <code>FAILED</code> - Action on product failed.
     * </p>
     * 
     * @return Current status of the product.</p>
     *         <p>
     *         <code>AVAILABLE</code> - Product is available for use.
     *         </p>
     *         <p>
     *         <code>CREATING</code> - Creation of product started, not ready for use.
     *         </p>
     *         <p>
     *         <code>FAILED</code> - Action on product failed.
     * @see Status
     */

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the product.
     * </p>
     * <p>
     * <code>AVAILABLE</code> - Product is available for use.
     * </p>
     * <p>
     * <code>CREATING</code> - Creation of product started, not ready for use.
     * </p>
     * <p>
     * <code>FAILED</code> - Action on product failed.
     * </p>
     * 
     * @param status
     *        Current status of the product.</p>
     *        <p>
     *        <code>AVAILABLE</code> - Product is available for use.
     *        </p>
     *        <p>
     *        <code>CREATING</code> - Creation of product started, not ready for use.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Action on product failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ProductViewDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the product.
     * </p>
     * <p>
     * <code>AVAILABLE</code> - Product is available for use.
     * </p>
     * <p>
     * <code>CREATING</code> - Creation of product started, not ready for use.
     * </p>
     * <p>
     * <code>FAILED</code> - Action on product failed.
     * </p>
     * 
     * @param status
     *        Current status of the product.</p>
     *        <p>
     *        <code>AVAILABLE</code> - Product is available for use.
     *        </p>
     *        <p>
     *        <code>CREATING</code> - Creation of product started, not ready for use.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Action on product failed.
     * @see Status
     */

    @com.fasterxml.jackson.annotation.JsonIgnore
    public void setStatus(Status status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the product.
     * </p>
     * <p>
     * <code>AVAILABLE</code> - Product is available for use.
     * </p>
     * <p>
     * <code>CREATING</code> - Creation of product started, not ready for use.
     * </p>
     * <p>
     * <code>FAILED</code> - Action on product failed.
     * </p>
     * 
     * @param status
     *        Current status of the product.</p>
     *        <p>
     *        <code>AVAILABLE</code> - Product is available for use.
     *        </p>
     *        <p>
     *        <code>CREATING</code> - Creation of product started, not ready for use.
     *        </p>
     *        <p>
     *        <code>FAILED</code> - Action on product failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public ProductViewDetail withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ARN associated with the product.
     * </p>
     * 
     * @param productARN
     *        The ARN associated with the product.
     */

    public void setProductARN(String productARN) {
        this.productARN = productARN;
    }

    /**
     * <p>
     * The ARN associated with the product.
     * </p>
     * 
     * @return The ARN associated with the product.
     */

    public String getProductARN() {
        return this.productARN;
    }

    /**
     * <p>
     * The ARN associated with the product.
     * </p>
     * 
     * @param productARN
     *        The ARN associated with the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewDetail withProductARN(String productARN) {
        setProductARN(productARN);
        return this;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @return The UTC timestamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewDetail withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getProductViewSummary() != null)
            sb.append("ProductViewSummary: ").append(getProductViewSummary()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProductARN() != null)
            sb.append("ProductARN: ").append(getProductARN()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductViewDetail == false)
            return false;
        ProductViewDetail other = (ProductViewDetail) obj;
        if (other.getProductViewSummary() == null ^ this.getProductViewSummary() == null)
            return false;
        if (other.getProductViewSummary() != null && other.getProductViewSummary().equals(this.getProductViewSummary()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProductARN() == null ^ this.getProductARN() == null)
            return false;
        if (other.getProductARN() != null && other.getProductARN().equals(this.getProductARN()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductViewSummary() == null) ? 0 : getProductViewSummary().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProductARN() == null) ? 0 : getProductARN().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ProductViewDetail clone() {
        try {
            return (ProductViewDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProductViewDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
