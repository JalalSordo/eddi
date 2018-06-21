/*
 * EDDI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BehaviorConfiguration;
import io.swagger.client.model.BotConfiguration;
import io.swagger.client.model.ConversationDescriptor;
import io.swagger.client.model.ConversationMemorySnapshot;
import io.swagger.client.model.ConversationStatus;
import io.swagger.client.model.DocumentDescriptor;
import io.swagger.client.model.ExtensionDescriptor;
import io.swagger.client.model.HttpCallsConfiguration;
import io.swagger.client.model.OutputConfigurationSet;
import io.swagger.client.model.PackageConfiguration;
import io.swagger.client.model.ParserConfiguration;
import io.swagger.client.model.PatchInstructionDocumentDescriptor;
import io.swagger.client.model.PatchInstructionOutputConfigurationSet;
import io.swagger.client.model.PatchInstructionRegularDictionaryConfiguration;
import io.swagger.client.model.Permissions;
import io.swagger.client.model.RegularDictionaryConfiguration;
import io.swagger.client.model.SimpleDocumentDescriptor;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationsApi
 */
@Ignore
public class ConfigurationsApiTest {

    private final ConfigurationsApi api = new ConfigurationsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBehaviorRuleSetTest() throws ApiException {
        BehaviorConfiguration body = null;
        api.createBehaviorRuleSet(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBotTest() throws ApiException {
        BotConfiguration body = null;
        api.createBot(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createHttpCallsTest() throws ApiException {
        HttpCallsConfiguration body = null;
        api.createHttpCalls(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOutputSetTest() throws ApiException {
        OutputConfigurationSet body = null;
        api.createOutputSet(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPackageTest() throws ApiException {
        PackageConfiguration body = null;
        api.createPackage(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createParserTest() throws ApiException {
        ParserConfiguration body = null;
        api.createParser(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRegularDictionaryTest() throws ApiException {
        RegularDictionaryConfiguration body = null;
        api.createRegularDictionary(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBehaviorRuleSetTest() throws ApiException {
        String id = null;
        Integer version = null;
        api.deleteBehaviorRuleSet(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBotTest() throws ApiException {
        String id = null;
        Integer version = null;
        api.deleteBot(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConversationLogTest() throws ApiException {
        String conversationId = null;
        Boolean deletePermanently = null;
        api.deleteConversationLog(conversationId, deletePermanently);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHttpCallsTest() throws ApiException {
        String id = null;
        Integer version = null;
        api.deleteHttpCalls(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOutputSetTest() throws ApiException {
        String id = null;
        Integer version = null;
        api.deleteOutputSet(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePackageTest() throws ApiException {
        String id = null;
        Integer version = null;
        api.deletePackage(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParserTest() throws ApiException {
        String id = null;
        Integer version = null;
        api.deleteParser(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRegularDictionaryTest() throws ApiException {
        String id = null;
        Integer version = null;
        api.deleteRegularDictionary(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void endActiveConversationsTest() throws ApiException {
        List<ConversationStatus> body = null;
        api.endActiveConversations(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActiveConversationsTest() throws ApiException {
        String botId = null;
        Integer botVersion = null;
        Integer index = null;
        Integer limit = null;
        List<ConversationStatus> response = api.getActiveConversations(botId, botVersion, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentVersionTest() throws ApiException {
        String id = null;
        Integer response = api.getCurrentVersion(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentVersion1Test() throws ApiException {
        String id = null;
        Integer response = api.getCurrentVersion1(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentVersion2Test() throws ApiException {
        String id = null;
        Integer response = api.getCurrentVersion2(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentVersion3Test() throws ApiException {
        String id = null;
        Integer response = api.getCurrentVersion3(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentVersion4Test() throws ApiException {
        String id = null;
        Integer response = api.getCurrentVersion4(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentVersion5Test() throws ApiException {
        String id = null;
        Integer response = api.getCurrentVersion5(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentVersion7Test() throws ApiException {
        String id = null;
        Integer response = api.getCurrentVersion7(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchDescriptorTest() throws ApiException {
        String id = null;
        Integer version = null;
        PatchInstructionDocumentDescriptor body = null;
        api.patchDescriptor(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOutputSetTest() throws ApiException {
        String id = null;
        Integer version = null;
        List<PatchInstructionOutputConfigurationSet> body = null;
        api.patchOutputSet(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchRegularDictionaryTest() throws ApiException {
        String id = null;
        Integer version = null;
        List<PatchInstructionRegularDictionaryConfiguration> body = null;
        api.patchRegularDictionary(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBehaviorDescriptorsTest() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readBehaviorDescriptors(filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBehaviorRuleSetTest() throws ApiException {
        String id = null;
        Integer version = null;
        BehaviorConfiguration response = api.readBehaviorRuleSet(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBotTest() throws ApiException {
        String id = null;
        Integer version = null;
        BotConfiguration response = api.readBot(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBotDescriptorsTest() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readBotDescriptors(filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readBotDescriptors_0Test() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        String body = null;
        List<DocumentDescriptor> response = api.readBotDescriptors_0(filter, index, limit, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readConversationDescriptorsTest() throws ApiException {
        Integer index = null;
        Integer limit = null;
        String botId = null;
        Integer botVersion = null;
        String conversationState = null;
        String viewState = null;
        List<ConversationDescriptor> response = api.readConversationDescriptors(index, limit, botId, botVersion, conversationState, viewState);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readConversationLogTest() throws ApiException {
        String conversationId = null;
        ConversationMemorySnapshot response = api.readConversationLog(conversationId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDescriptorTest() throws ApiException {
        String id = null;
        Integer version = null;
        DocumentDescriptor response = api.readDescriptor(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readDescriptorsTest() throws ApiException {
        String type = null;
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readDescriptors(type, filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readExpressionsTest() throws ApiException {
        String id = null;
        Integer version = null;
        String filter = null;
        String order = null;
        Integer index = null;
        Integer limit = null;
        List<String> response = api.readExpressions(id, version, filter, order, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readExtensionDescriptorsTest() throws ApiException {
        String filter = null;
        List<ExtensionDescriptor> response = api.readExtensionDescriptors(filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readHttpCallsTest() throws ApiException {
        String id = null;
        Integer version = null;
        HttpCallsConfiguration response = api.readHttpCalls(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readHttpCallsDescriptorsTest() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readHttpCallsDescriptors(filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOutputDescriptorsTest() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readOutputDescriptors(filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOutputKeysTest() throws ApiException {
        String id = null;
        Integer version = null;
        String filter = null;
        String order = null;
        Integer limit = null;
        List<String> response = api.readOutputKeys(id, version, filter, order, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readOutputSetTest() throws ApiException {
        String id = null;
        Integer version = null;
        String filter = null;
        String order = null;
        Integer index = null;
        Integer limit = null;
        OutputConfigurationSet response = api.readOutputSet(id, version, filter, order, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPackageTest() throws ApiException {
        String id = null;
        Integer version = null;
        PackageConfiguration response = api.readPackage(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPackageDescriptorsTest() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readPackageDescriptors(filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPackageDescriptors_0Test() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        String body = null;
        List<DocumentDescriptor> response = api.readPackageDescriptors_0(filter, index, limit, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readParserTest() throws ApiException {
        String id = null;
        Integer version = null;
        ParserConfiguration response = api.readParser(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readParserDescriptorsTest() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readParserDescriptors(filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readPermissionsTest() throws ApiException {
        String resourceId = null;
        Permissions response = api.readPermissions(resourceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRegularDictionaryTest() throws ApiException {
        String id = null;
        Integer version = null;
        String filter = null;
        String order = null;
        Integer index = null;
        Integer limit = null;
        RegularDictionaryConfiguration response = api.readRegularDictionary(id, version, filter, order, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readRegularDictionaryDescriptorsTest() throws ApiException {
        String filter = null;
        Integer index = null;
        Integer limit = null;
        List<DocumentDescriptor> response = api.readRegularDictionaryDescriptors(filter, index, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readSimpleDescriptorTest() throws ApiException {
        String id = null;
        Integer version = null;
        SimpleDocumentDescriptor response = api.readSimpleDescriptor(id, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redirectToLatestVersionTest() throws ApiException {
        String id = null;
        api.redirectToLatestVersion(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redirectToLatestVersion1Test() throws ApiException {
        String id = null;
        api.redirectToLatestVersion1(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redirectToLatestVersion2Test() throws ApiException {
        String id = null;
        api.redirectToLatestVersion2(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redirectToLatestVersion3Test() throws ApiException {
        String id = null;
        api.redirectToLatestVersion3(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redirectToLatestVersion4Test() throws ApiException {
        String id = null;
        api.redirectToLatestVersion4(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redirectToLatestVersion5Test() throws ApiException {
        String id = null;
        api.redirectToLatestVersion5(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redirectToLatestVersion7Test() throws ApiException {
        String id = null;
        api.redirectToLatestVersion7(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBehaviorRuleSetTest() throws ApiException {
        String id = null;
        Integer version = null;
        BehaviorConfiguration body = null;
        api.updateBehaviorRuleSet(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBotTest() throws ApiException {
        String id = null;
        Integer version = null;
        BotConfiguration body = null;
        api.updateBot(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHttpCallsTest() throws ApiException {
        String id = null;
        Integer version = null;
        HttpCallsConfiguration body = null;
        api.updateHttpCalls(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOutputSetTest() throws ApiException {
        String id = null;
        Integer version = null;
        OutputConfigurationSet body = null;
        api.updateOutputSet(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePackageTest() throws ApiException {
        String id = null;
        Integer version = null;
        PackageConfiguration body = null;
        api.updatePackage(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateParserTest() throws ApiException {
        String id = null;
        Integer version = null;
        ParserConfiguration body = null;
        api.updateParser(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePermissionsTest() throws ApiException {
        String resourceId = null;
        Permissions body = null;
        api.updatePermissions(resourceId, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRegularDictionaryTest() throws ApiException {
        String id = null;
        Integer version = null;
        RegularDictionaryConfiguration body = null;
        api.updateRegularDictionary(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateResourceInBotTest() throws ApiException {
        String id = null;
        Integer version = null;
        String body = null;
        api.updateResourceInBot(id, version, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateResourceInPackageTest() throws ApiException {
        String id = null;
        Integer version = null;
        String body = null;
        api.updateResourceInPackage(id, version, body);

        // TODO: test validations
    }
    
}
