/*
 * Femsa API
 * Femsa sdk
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: engineering@femsa.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.digitalfemsa;

import com.digitalfemsa.*;
import com.digitalfemsa.auth.*;
import com.digitalfemsa.model.Error;
import com.digitalfemsa.model.GetOrdersResponse;
import com.digitalfemsa.model.OrderCaptureRequest;
import com.digitalfemsa.model.OrderRefundRequest;
import com.digitalfemsa.model.OrderRequest;
import com.digitalfemsa.model.OrderResponse;
import com.digitalfemsa.model.OrderUpdateRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    /**
     * Cancel Order
     *
     * Cancel an order that has been previously created.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelOrderTest() throws ApiException {
        //String id = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //OrderResponse response = api.cancelOrder(id, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Create order
     *
     * Create a new order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrderTest() throws ApiException {
        //OrderRequest orderRequest = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //OrderResponse response = api.createOrder(orderRequest, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Get Order
     *
     * Info for a specific order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        //String id = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //OrderResponse response = api.getOrderById(id, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Get a list of Orders
     *
     * Get order details in the form of a list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrdersTest() throws ApiException {
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //Integer limit = null;
        //String search = null;
        //String next = null;
        //String previous = null;
        //GetOrdersResponse response = api.getOrders(acceptLanguage, xChildCompanyId, limit, search, next, previous);
        // TODO: test validations
    }

    /**
     * Cancel Refund
     *
     * A refunded order describes the items, amount, and reason an order is being refunded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void orderCancelRefundTest() throws ApiException {
        //String id = null;
        //String refundId = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //OrderResponse response = api.orderCancelRefund(id, refundId, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Refund Order
     *
     * A refunded order describes the items, amount, and reason an order is being refunded.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void orderRefundTest() throws ApiException {
        //String id = null;
        //OrderRefundRequest orderRefundRequest = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //OrderResponse response = api.orderRefund(id, orderRefundRequest, acceptLanguage, xChildCompanyId);
        // TODO: test validations
    }

    /**
     * Capture Order
     *
     * Processes an order that has been previously authorized.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ordersCreateCaptureTest() throws ApiException {
        //String id = null;
        //String acceptLanguage = null;
        //String xChildCompanyId = null;
        //OrderCaptureRequest orderCaptureRequest = null;
        //OrderResponse response = api.ordersCreateCapture(id, acceptLanguage, xChildCompanyId, orderCaptureRequest);
        // TODO: test validations
    }

    /**
     * Update Order
     *
     * Update an existing Order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrderTest() throws ApiException {
        //String id = null;
        //OrderUpdateRequest orderUpdateRequest = null;
        //String acceptLanguage = null;
        //OrderResponse response = api.updateOrder(id, orderUpdateRequest, acceptLanguage);
        // TODO: test validations
    }

}