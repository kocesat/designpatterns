package com.kocesat.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type)) {
            var icon = new PointIcon(type, null);
            icons.put(type, icon);
        }
        return icons.get(type);
    }
}
