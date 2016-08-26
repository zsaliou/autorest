/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head;

import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpSuccess.
 */
public interface HttpSuccess {
    /**
     * Return 200 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Boolean> head200() throws CloudException, IOException;

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> head200Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Return 200 status code if successful.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> head200Async();

    /**
     * Return 204 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Boolean> head204() throws CloudException, IOException;

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> head204Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Return 204 status code if successful.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> head204Async();

    /**
     * Return 404 status code if successful.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the boolean object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Boolean> head404() throws CloudException, IOException;

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Boolean> head404Async(final ServiceCallback<Boolean> serviceCallback);

    /**
     * Return 404 status code if successful.
     *
     * @return the observable to the boolean object
     */
    Observable<ServiceResponse<Boolean>> head404Async();

}
