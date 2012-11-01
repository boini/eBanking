package com.ebanking.ws.util;


import org.apache.log4j.Logger;
import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.InputSource;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Allows to generate mock java objects of custom classes
 * Uses Castor framework
 */
public class CastorMockUtil {

    /**
     * Custom classes names
     */
    public enum MockEntity {
        COUNTRY,
        CITY,
        ADDRESS,
        CLIENT,
        ACCOUNT
    }

    /**
     * Log4j logger instance
     */
    private static final Logger LOGGER = Logger.getLogger(CastorMockUtil.class);
    /**
     * Castor mapping file path
     */
    private static final String CASTOR_MAPPING_FILE_PATH = "src/test/resources/castor/mapping.xml";
    /**
     * Map with paths to mock xml files
     */
    private static final Map<MockEntity, String> pathMap = new HashMap<MockEntity, String>();

    /**
     * Initialization of paths map
     */
    static {
        pathMap.put(MockEntity.COUNTRY, "src/test/resources/castor/mock/countryMock.xml");
        pathMap.put(MockEntity.CITY, "src/test/resources/castor/mock/cityMock.xml");
        pathMap.put(MockEntity.ADDRESS, "src/test/resources/castor/mock/addressMock.xml");
        pathMap.put(MockEntity.CLIENT, "src/test/resources/castor/mock/clientMock.xml");
        pathMap.put(MockEntity.ACCOUNT, "src/test/resources/castor/mock/accountMock.xml");
    }

    /**
     * Defines which type of object to generate and calls specific method with appropriate parameters
     * @param mockEntity {@link MockEntity} to identify object class to generate
     * @return Generated object
     */
    public static Object createMock(MockEntity mockEntity) {
        if (mockEntity == null) {
            LOGGER.error("MockEntity parameter can't be null");
            throw new IllegalArgumentException();
        }
        switch (mockEntity) {
            case COUNTRY:
                return createCastorObject(pathMap.get(MockEntity.COUNTRY));
            case CITY:
                return createCastorObject(pathMap.get(MockEntity.CITY));
            case ADDRESS:
                return createCastorObject(pathMap.get(MockEntity.ADDRESS));
            case CLIENT:
                return createCastorObject(pathMap.get(MockEntity.CLIENT));
            case ACCOUNT:
                return createCastorObject(pathMap.get(MockEntity.ACCOUNT));
            default:
                LOGGER.error("Illegal parameter was provided");
                throw new IllegalArgumentException();
        }
    }

    /**
     *  Creates castor object using mapping configuration and mock xml file
     * @param path Path to mock xml file
     * @return Generated object from xml file
     */
    private static Object createCastorObject(String path) {
        Object resultObject = null;
        try {
            Mapping mapping = new Mapping();
            mapping.loadMapping(CASTOR_MAPPING_FILE_PATH);
            Unmarshaller unmarshaller = new Unmarshaller(mapping);
            resultObject = unmarshaller.unmarshal(new InputSource(new FileReader(path)));
        } catch (MarshalException exception) {
            LOGGER.error(exception);
        } catch (ValidationException exception) {
            LOGGER.error(exception);
        } catch (MappingException exception) {
            LOGGER.error(exception);
        } catch (IOException exception) {
            LOGGER.error(exception);
        }
        return resultObject;
    }
}
