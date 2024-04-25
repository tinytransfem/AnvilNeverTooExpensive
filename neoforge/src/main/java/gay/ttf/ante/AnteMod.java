package gay.ttf.ante;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class AnteMod {

    public AnteMod(IEventBus eventBus) {
        CommonClass.init();
    }
}