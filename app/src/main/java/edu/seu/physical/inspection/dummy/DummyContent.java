package edu.seu.physical.inspection.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    public enum Functions {
        GENERAL("信息概览", "general"), BLOOD_PRESSURE("血压详情", "blood_pressure");

        private String title;
        private String name;

        private Functions(String title, String name) {
            this.name = name;
            this.title = title;
        }

        public String getName() {
            return name;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return this.name + ":" + this.title;
        }
    }

    private static final int COUNT = 25;

    static {
        for (Functions func: Functions.values()) {
            DummyContent.addItem(new DummyContent.DummyItem(func.getName(), func.getTitle()));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.name, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String name;
        public final String title;

        private DummyItem(String name, String title) {
            this.name = name;
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}
