/*
 * YNAB API Endpoints
 * Our API uses a REST based design, leverages the JSON data format, and relies upon HTTPS for transport. We respond with meaningful HTTP response codes and if an error occurs, we include error details in the response body.  API Documentation is at https://api.youneedabudget.com
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ynab.client.api;

import com.squareup.okhttp.Call;
import org.junit.Before;
import org.mockito.Matchers;
import ynab.client.invoker.ApiClient;
import ynab.client.invoker.ApiException;
import java.math.BigDecimal;

import ynab.client.invoker.ApiResponse;
import ynab.client.model.*;

import java.util.*;

import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

/**
 * API tests for BudgetsApi
 */
public class BudgetsApiTest {
    private ApiClient mockApiClient;

    private BudgetsApi budgetsApi;
    private BudgetDetailResponse budgetDetailResponse;
    private BudgetSummaryResponse budgetSummaryResponse;
    private final String budgetId = "someBudgetId";
    private final String accountId = "someAccountId";

    @Before
    public void setup(){
        System.out.println("Setup");
        mockApiClient = mock(ApiClient.class);
        doReturn("anything").when(mockApiClient).escapeString(anyString());
        budgetsApi = new BudgetsApi(mockApiClient);
        BudgetDetail budgetDetail = new BudgetDetail();
        budgetDetail.setId("someId");

        BudgetDetailWrapper budgetDetailWrapper = new BudgetDetailWrapper();
        budgetDetailWrapper.setBudget(budgetDetail);
        budgetDetailResponse = new BudgetDetailResponse();
        budgetDetailResponse.setData(budgetDetailWrapper);

        BudgetSummary budgetSummary = new BudgetSummary();
        budgetSummary.setId("someId");
        BudgetSummaryWrapper budgetSummaryWrapper = new BudgetSummaryWrapper();
        List<BudgetSummary> budgetSummaryList = new LinkedList<>();
        budgetSummaryList.add(budgetSummary);
        budgetSummaryWrapper.setBudgets(budgetSummaryList);
        budgetSummaryResponse = new BudgetSummaryResponse();
        budgetSummaryResponse.setData(budgetSummaryWrapper);
    }
    
    /**
     * Single budget
     *
     * Returns a single budget with all related entities.  This resource is effectively a full budget export.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBudgetByIdTest() throws ApiException {
        BigDecimal lastKnowledgeOfServer = null;
        ApiResponse<BudgetDetailResponse> budgetDetailResponseApiResponse = new ApiResponse<BudgetDetailResponse>(200, null, budgetDetailResponse);
        doReturn(budgetDetailResponseApiResponse).when(mockApiClient).execute(any(Call.class), Matchers.<Class<BudgetDetailResponse>>any());
        BudgetDetailResponse response = budgetsApi.getBudgetById(budgetId, lastKnowledgeOfServer);
        assertEquals(response.getData().getBudget().getId(), "someId");
    }
    
    /**
     * List budgets
     *
     * Returns budgets list with summary information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBudgetsTest() throws ApiException {
        BigDecimal lastKnowledgeOfServer = null;
        ApiResponse<BudgetSummaryResponse> budgetDetailResponseApiResponse = new ApiResponse<>(200, null, budgetSummaryResponse);
        doReturn(budgetDetailResponseApiResponse).when(mockApiClient).execute(any(Call.class), Matchers.<Class<BudgetDetailResponse>>any());
        BudgetSummaryResponse response = budgetsApi.getBudgets();
        assertEquals(response.getData().getBudgets().get(0).getId(), "someId");
    }
    
}
