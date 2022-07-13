package cn.nukkit.network.protocol;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;

import lombok.ToString;

/**
 * @author MagicDroidX (Nukkit Project)
 */
@ToString
public class EntityEventPacket extends DataPacket {
    public static final int NETWORK_ID = ProtocolInfo.ENTITY_EVENT_PACKET;

    @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int NONE = 0;
    public static final int JUMP = 1;
    public static final int HURT_ANIMATION = 2;
    public static final int DEATH_ANIMATION = 3;
    public static final int ARM_SWING = 4;
    public static final int STOP_ATTACK = 5;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int ATTACK_STOP = STOP_ATTACK;
    public static final int TAME_FAIL = 6;
    public static final int TAME_SUCCESS = 7;
    public static final int SHAKE_WET = 8;
    public static final int USE_ITEM = 9;
    public static final int EAT_GRASS_ANIMATION = 10;
    public static final int FISH_HOOK_BUBBLE = 11;
    public static final int FISH_HOOK_POSITION = 12;
    public static final int FISH_HOOK_HOOK = 13;
    public static final int FISH_HOOK_TEASE = 14;
    public static final int SQUID_INK_CLOUD = 15;
    public static final int ZOMBIE_VILLAGER_CURE = 16;
    public static final int AMBIENT_SOUND = 17;
    public static final int RESPAWN = 18;
    public static final int IRON_GOLEM_OFFER_FLOWER = 19;
    public static final int IRON_GOLEM_WITHDRAW_FLOWER = 20;
    public static final int LOVE_PARTICLES = 21;
    public static final int VILLAGER_ANGRY = 22;
    public static final int VILLAGER_HAPPY = 23;
    public static final int WITCH_SPELL_PARTICLES = 24;
    public static final int FIREWORK_EXPLOSION = 25;
    public static final int IN_LOVE_PARTICLES = 26;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int IN_LOVE_HEARTS = IN_LOVE_PARTICLES;
    public static final int SILVERFISH_SPAWN_ANIMATION = 27;
    public static final int GUARDIAN_ATTACK = 28;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int GUARDIAN_ATTACK_ANIMATION = GUARDIAN_ATTACK;
    public static final int WITCH_DRINK_POTION = 29;
    public static final int WITCH_THROW_POTION = 30;
    public static final int MINECART_TNT_PRIME_FUSE = 31;
    public static final int CREEPER_PRIME_FUSE = 32;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int PRIME_CREEPER = CREEPER_PRIME_FUSE;
    public static final int AIR_SUPPLY_EXPIRED = 33;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int AIR_SUPPLY = AIR_SUPPLY_EXPIRED;
    public static final int ENCHANT = 34;
    public static final int ELDER_GUARDIAN_CURSE = 35;
    public static final int AGENT_ARM_SWING = 36;
    public static final int ENDER_DRAGON_DEATH = 37;
    public static final int DUST_PARTICLES = 38;
    public static final int ARROW_SHAKE = 39;

    public static final int EATING_ITEM = 57;

    public static final int BABY_ANIMAL_FEED = 60;
    public static final int DEATH_SMOKE_CLOUD = 61;
    public static final int COMPLETE_TRADE = 62;
    public static final int REMOVE_LEASH = 63;
    public static final int CARAVAN_UPDATED = 64;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int CARAVAN = CARAVAN_UPDATED;
    public static final int CONSUME_TOTEM = 65;
    public static final int PLAYER_CHECK_TREASURE_HUNTER_ACHIEVEMENT = 66;
    public static final int ENTITY_SPAWN = 67;
    public static final int DRAGON_PUKE = 68;
    public static final int MERGE_ITEMS = 69;
    public static final int START_SWIM = 70;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int START_SWIMMING = START_SWIM;
    public static final int BALLOON_POP = 71;
    public static final int TREASURE_HUNT = 72;
    public static final int AGENT_SUMMON = 73;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int SUMMON_AGENT = AGENT_SUMMON;
    public static final int CHARGED_CROSSBOW = 74;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int FINISHED_CHARGING_CROSSBOW = CHARGED_CROSSBOW;
    public static final int FALL = 75;
    @Deprecated @PowerNukkitOnly @Since("1.4.0.0-PN") public static final int LANDED_ON_GROUND = FALL;
    public static final int GROW_UP = 76;
    public static final int VIBRATION_DETECTED = 77;
    public static final int DRINK_MILK = 78;

    @Override
    public byte pid() {
        return NETWORK_ID;
    }

    public long eid;
    public int event;
    public int data;

    @Override
    public void decode() {
        this.eid = this.getEntityRuntimeId();
        this.event = this.getByte();
        this.data = this.getVarInt();
    }

    @Override
    public void encode() {
        this.reset();
        this.putEntityRuntimeId(this.eid);
        this.putByte((byte) this.event);
        this.putVarInt(this.data);
    }
}
