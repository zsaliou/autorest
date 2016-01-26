/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for putAsyncRelativeRetrySucceeded operation.
 */
public class LRORetrysPutAsyncRelativeRetrySucceededHeaders {
    /**
     * Location to poll for result status: will be set to
     * /lro/retryerror/putasync/retry/succeeded/operationResults/200.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Location to poll for result status: will be set to
     * /lro/retryerror/putasync/retry/succeeded/operationResults/200.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Number of milliseconds until the next poll should be sent, will be set
     * to zero.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * Get the azureAsyncOperation value.
     *
     * @return the azureAsyncOperation value
     */
    public String getAzureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation value.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     */
    public void setAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Get the retryAfter value.
     *
     * @return the retryAfter value
     */
    public Integer getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter value.
     *
     * @param retryAfter the retryAfter value to set
     */
    public void setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
    }

}
