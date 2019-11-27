package com.linkedin.paldb.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalDBConfigBuilderTest {

    @Test
    void testAllPropertiesSet() {
        var config = PalDBConfigBuilder.create()
                .withMemoryMapSegmentSize(500)
                .withMemoryMapDataEnabled(false)
                .withIndexLoadFactor(0.5)
                .withEnableCompression(true)
                .withEnableBloomFilter(true)
                .withBloomFilterErrorFactor(0.01)
                .withEnableDuplicates(true)
                .withWriteBufferElements(100)
                .build();

        assertEquals(500, config.getInt(Configuration.MMAP_SEGMENT_SIZE));
        assertFalse(config.getBoolean(Configuration.MMAP_DATA_ENABLED));
        assertEquals(0.5, config.getDouble(Configuration.LOAD_FACTOR));
        assertTrue(config.getBoolean(Configuration.COMPRESSION_ENABLED));
        assertTrue(config.getBoolean(Configuration.BLOOM_FILTER_ENABLED));
        assertEquals(0.01, config.getDouble(Configuration.BLOOM_FILTER_ERROR_FACTOR));
        assertTrue(config.getBoolean(Configuration.ALLOW_DUPLICATES));
        assertEquals(100, config.getInt(Configuration.WRITE_BUFFER_SIZE));
    }
}