package de.gzockoll.prototype.gsc;

import com.gs.collections.api.map.MutableMap;
import com.gs.collections.impl.map.mutable.UnifiedMap;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: guido
 * Date: 18.07.13
 * Time: 06:07
 * To change this template use File | Settings | File Templates.
 */
public class GscTest {

    @Test
    public void testCollections() {
        MutableMap<String,Integer> map = new UnifiedMap<String, Integer>();

        Integer result = map.get("Hurz");
    }
}
