package at.hannibal2.skyhanni.config.features;

import at.hannibal2.skyhanni.config.FeatureToggle;
import at.hannibal2.skyhanni.config.core.config.Position;
import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.*;
import io.github.moulberry.moulconfig.observer.Property;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiscConfig {

    @Expose
    @ConfigOption(name = "Pet", desc = "")
    @ConfigEditorAccordion(id = 0)
    public boolean pet = false;

    @Expose
    @ConfigOption(name = "Pet Display", desc = "Show the currently active pet.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 0)
    @FeatureToggle
    public boolean petDisplay = false;

    @Expose
    @ConfigOption(name = "Pet Experience Tooltip", desc = "")
    @ConfigAccordionId(id = 0)
    @Accordion
    public PetExperienceToolTipConfig petExperienceToolTip = new PetExperienceToolTipConfig();

    public static class PetExperienceToolTipConfig {

        @Expose
        @ConfigOption(name = "Enabled", desc = "Show the full pet exp and the progress to level 100 (ignoring rarity) when hovering over an pet while pressing shift key.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean petDisplay = true;

        @Expose
        @ConfigOption(name = "Show Always", desc = "Show this info always, even if not pressing shift key.")
        @ConfigEditorBoolean
        public boolean showAlways = false;

        @Expose
        @ConfigOption(name = "GDrag 200", desc = "Show for Golden Dragon the exp needed for level 200.")
        @ConfigEditorBoolean
        public boolean goldenDragon200 = true;

    }

    @Expose
    public Position petDisplayPos = new Position(-330, -15, false, true);

    @ConfigOption(name = "Hide Armor", desc = "")
    @Accordion
    @Expose
    public HideArmor hideArmor2 = new HideArmor();

    public static class HideArmor {

        @Expose
        @ConfigOption(name = "Mode", desc = "Hide the armor of players.")
        @ConfigEditorDropdown(values = {"All", "Own Armor", "Other's Armor", "Off"})
        @ConfigAccordionId(id = 1)
        public int mode = 3;

        @Expose
        @ConfigOption(name = "Only Helmet", desc = "Only hide the helmet.")
        @ConfigEditorBoolean()
        @ConfigAccordionId(id = 3)
        public Boolean onlyHelmet = false;

    }

    @Expose
    @ConfigOption(name = "Potion Effects", desc = "")
    @ConfigEditorAccordion(id = 5)
    public boolean potionEffects = false;

    @Expose
    @ConfigOption(name = "Non God Pot Effects", desc = "Display the active potion effects that are not part of the God Pot.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 5)
    @FeatureToggle
    public boolean nonGodPotEffectDisplay = false;

    @Expose
    @ConfigOption(name = "Show Mixins", desc = "Include god pot mixins in the Non God Pot Effects display.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 5)
    @FeatureToggle
    public boolean nonGodPotEffectShowMixins = false;

    @Expose
    public Position nonGodPotEffectPos = new Position(10, 10, false, true);

    @Expose
    @ConfigOption(name = "Particle Hider", desc = "")
    @ConfigEditorAccordion(id = 9)
    public boolean particleHider = false;

    @Expose
    @ConfigOption(name = "Blaze Particles", desc = "Hide Blaze particles.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 9)
    @FeatureToggle
    public boolean hideBlazeParticles = false;

    @Expose
    @ConfigOption(name = "Enderman Particles", desc = "Hide Enderman particles.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 9)
    @FeatureToggle
    public boolean hideEndermanParticles = false;

    @Expose
    @ConfigOption(name = "Fireball Particles", desc = "Hide fireball particles.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 9)
    @FeatureToggle
    public boolean hideFireballParticles = true;

    @Expose
    @ConfigOption(name = "Fire Particles", desc = "Hide particles from the fire block.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 9)
    @FeatureToggle
    public boolean hideFireBlockParticles = true;

    @Expose
    @ConfigOption(name = "Smoke Particles", desc = "Hide smoke particles.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 9)
    @FeatureToggle
    public boolean hideSmokeParticles = false;

    @Expose
    @ConfigOption(name = "Far Particles", desc = "Hide particles that are more than 40 blocks away.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 9)
    @FeatureToggle
    public boolean hideFarParticles = true;

    @Expose
    @ConfigOption(name = "Close Redstone Particles", desc = "Hide Redstone particles around the player (appear for some potion effects).")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 9)
    @FeatureToggle
    public boolean hideCloseRedstoneparticles = true;

    @Expose
    @ConfigOption(name = "Estimated Item Value", desc = "(Prices for Enchantments, Reforge Stones, Gemstones, Drill Parts and more)")
    @ConfigEditorAccordion(id = 11)
    public boolean estimatedItemValue = false;

    @Expose
    @ConfigOption(name = "Enable Estimated Price", desc = "Displays an Estimated Item Value for the item you hover over.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 11)
    @FeatureToggle
    public boolean estimatedIemValueEnabled = false;

    @Expose
    @ConfigOption(name = "Hotkey", desc = "Press this key to show the Estimated Item Value.")
    @ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
    @ConfigAccordionId(id = 11)
    public int estimatedItemValueHotkey = Keyboard.KEY_NONE;

    @Expose
    @ConfigOption(name = "Show always", desc = "Ignore the hotkey and always display the item value.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 11)
    public boolean estimatedIemValueAlwaysEnabled = true;

    @Expose
    @ConfigOption(name = "Enchantments Cap", desc = "Only show the top # most expensive enchantments.")
    @ConfigEditorSlider(
            minValue = 1,
            maxValue = 30,
            minStep = 1
    )
    @ConfigAccordionId(id = 11)
    public Property<Integer> estimatedIemValueEnchantmentsCap = Property.of(7);


    @Expose
    @ConfigOption(name = "Show Exact Price", desc = "Show the exact total price instead of the compact number.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 11)
    public boolean estimatedIemValueExactPrice = false;

    @Expose
    @ConfigOption(name = "Show Armor Value", desc = "Show the value of the full armor set in the Wardrobe inventory.")
    @ConfigEditorBoolean
    @ConfigAccordionId(id = 11)
    @FeatureToggle
    public boolean estimatedIemValueArmor = true;

    @Expose
    public Position itemPriceDataPos = new Position(140, 90, false, true);

    @ConfigOption(name = "Discord Rich Presence", desc = "")
    @Accordion
    @Expose
    public DiscordRPC discordRPC = new DiscordRPC();

    public static class DiscordRPC {

        @Expose
        @ConfigOption(name = "Enable Discord RPC", desc = "Details about your SkyBlock session displayed through Discord.")
        @ConfigEditorBoolean
        @FeatureToggle
        public Property<Boolean> enabled = Property.of(false);

        @Expose
        @ConfigOption(name = "First Line", desc = "Decide what to show in the first line.")
        @ConfigEditorDropdown(values = {
                "Nothing",
                "Location",
                "Purse",
                "Bits",
                "Stats",
                "Held Item",
                "SkyBlock Date",
                "Profile",
                "Slayer",
                "Custom",
                "Dynamic",
                "Crop Milestone",
                "Current Pet"
        })
        public Property<Integer> firstLine = Property.of(0);

        @Expose
        @ConfigOption(name = "Second Line", desc = "Decide what to show in the second line.")
        @ConfigEditorDropdown(values = {
                "Nothing",
                "Location",
                "Purse",
                "Bits",
                "Stats",
                "Held Item",
                "SkyBlock Date",
                "Profile",
                "Slayer",
                "Custom",
                "Dynamic",
                "Crop Milestone",
                "Current Pet"
        })
        public Property<Integer> secondLine = Property.of(0);

        @Expose
        @ConfigOption(name = "Custom", desc = "What should be displayed if you select \"Custom\" above.")
        @ConfigEditorText
        public Property<String> customText = Property.of("");

        @Expose
        @ConfigOption(name = "Dynamic", desc = "\"Dynamic\" above shows your Crop Milestone, Slayer progress, or Stacking enchantment when possible, but this if you're doing none of them.")
        @ConfigEditorDropdown(values = {
                "Nothing",
                "Location",
                "Purse",
                "Bits",
                "Stats",
                "Held Item",
                "SkyBlock Date",
                "Profile",
                "Slayer",
                "Custom",
                "Crop Milestone",
                "Current Pet"
        })
        public Property<Integer> auto = Property.of(0);
    }

    @ConfigOption(name = "Trevor The Trapper", desc = "")
    @Accordion
    @Expose
    public TrevorTheTrapper trevorTheTrapper = new TrevorTheTrapper();

    public static class TrevorTheTrapper {

        @Expose
        @ConfigOption(
                name = "Enable Data Tracker",
                desc = "Tracks all of your data from doing Trevor Quests.\n" +
                        "Shows based on the setting below"
        )
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean dataTracker = true;

        @Expose
        @ConfigOption(
                name = "Show Between Quests",
                desc = "Shows the tracker during and between quests otherwise it will only show during them." +
                        "Will show in the Trapper's Den regardless. Global toggle above"
        )
        @ConfigEditorBoolean
        public boolean displayType = true;

        @Expose
        @ConfigOption(
                name = "Text Format",
                desc = "Drag text to change the appearance of the overlay."
        )
        @ConfigEditorDraggableList(
                exampleText = {
                        "§b§lTrevor Data Tracker",
                        "§b1,428 §9Quests Started",
                        "§b11,281 §5Total Pelts Gained",
                        "§b2,448 §5Pelts Per Hour",
                        "",
                        "§b850 §cKilled Animals",
                        "§b153 §cSelf Killing Animals",
                        "§b788 §fTrackable Animals",
                        "§b239 §aUntrackable Animals",
                        "§b115 §9Undetected Animals",
                        "§b73 §5Endangered Animals",
                        "§b12 §6Elusive Animals"
                }
        )
        public List<Integer> textFormat = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11));

        @Expose
        public Position position = new Position(10, 80, false, true);

        @Expose
        @ConfigOption(name = "Trapper Solver", desc = "Assists you in finding Trevor's mobs. §eNote: May not always work as expected. " +
                "§cWill not help you to find rabbits or sheep in the Oasis!")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean trapperSolver = true;

        @Expose
        @ConfigOption(name = "Mob Dead Warning", desc = "Show a message when Trevor's mob dies.")
        @ConfigEditorBoolean
        public boolean trapperMobDiedMessage = true;

        @Expose
        @ConfigOption(name = "Warp to Trapper", desc = "Warp to Trevor's Den. Works only inside the Farming Islands.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean warpToTrapper = false;

        @Expose
        @ConfigOption(name = "Accept Trapper Quest", desc = "Click this key after the chat prompt to accept Trevor's quest.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean acceptQuest = false;

        @Expose
        @ConfigOption(name = "Trapper Hotkey", desc = "Press this key to warp to Trevor's Den or to accept the quest. " +
                "§eRequires the relevant above settings to be toggled")
        @ConfigEditorKeybind(defaultKey = Keyboard.KEY_NONE)
        public int keyBindWarpTrapper = Keyboard.KEY_NONE;


        @Expose
        @ConfigOption(name = "Trapper Cooldown", desc = "Change the color of Trevor and adds a cooldown over his head.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean trapperTalkCooldown = true;

        @Expose
        @ConfigOption(
                name = "Trapper Cooldown GUI",
                desc = "Show the cooldown on screen in an overlay (intended for Abiphone users)."
        )
        @ConfigEditorBoolean
        public boolean trapperCooldownGui = false;

        @Expose
        public Position trapperCooldownPos = new Position(10, 10, false, true);
    }

    @ConfigOption(name = "Teleport Pads On Private Island", desc = "")
    @Accordion
    @Expose
    public TeleportPad teleportPad = new TeleportPad();

    public static class TeleportPad {

        @Expose
        @ConfigOption(name = "Compact Name", desc = "Hide the 'Warp to' and 'No Destination' texts over teleport pads.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean compactName = false;

        @Expose
        @ConfigOption(name = "Inventory Numbers", desc = "Show the number of the teleport pads inside the 'Change Destination' inventory as stack size.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean inventoryNumbers = false;
    }

    @ConfigOption(name = "Pocket Sack-In-A-Sack", desc = "")
    @Accordion
    @Expose
    public PocketSackInASack pocketSackInASack = new PocketSackInASack();

    public static class PocketSackInASack {

        @Expose
        @ConfigOption(name = "Show in Overlay", desc = "Show the number of Pocket Sack-In-A-Sack applied on a sack icon as an overlay.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean showOverlay = false;

        @Expose
        @ConfigOption(name = "Replace In Lore", desc = "Replace how text is displayed in lore.\nShow §eis stitched with 2/3...\n§7Instead of §eis stitched with two...")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean replaceLore = true;
    }

    @ConfigOption(name = "Quick Mod Menu Switch", desc = "")
    @Accordion
    @Expose
    public QuickModMenuSwitch quickModMenuSwitch = new QuickModMenuSwitch();

    public static class QuickModMenuSwitch {

        @Expose
        @ConfigOption(name = "Enabled", desc = "Adding a mod list, allowing to quickly switch between different mod menus.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean enabled = false;

        @Expose
        @ConfigOption(name = "Inside Escape Menu", desc = "Show the mod list while inside the Escape menu.")
        @ConfigEditorBoolean
        public boolean insideEscapeMenu = true;

        @Expose
        @ConfigOption(name = "Inside Inventory", desc = "Show the mod list while inside the player inventory (no chest inventory).")
        @ConfigEditorBoolean
        public boolean insidePlayerInventory = false;

        @Expose
        public Position pos = new Position(-178, 143, false, true);
    }

    @Expose
    @ConfigOption(name = "Cosmetic", desc = "")
    @Accordion
    public CosmeticConfig cosmeticConfig = new CosmeticConfig();

    public static class CosmeticConfig {

        @Expose
        @ConfigOption(name = "Following Line", desc = "")
        @Accordion
        public FollowingLineConfig followingLineConfig = new FollowingLineConfig();

        public static class FollowingLineConfig {

            @Expose
            @ConfigOption(name = "Enabled", desc = "Draw a colored line behind the player.")
            @ConfigEditorBoolean
            @FeatureToggle
            public boolean enabled = false;

            @Expose
            @ConfigOption(name = "Line color", desc = "Color of the line.")
            @ConfigEditorColour
            public String lineColor = "0:255:255:255:255";

            @Expose
            @ConfigOption(name = "Time Alive", desc = "Time in seconds until the line fades out.")
            @ConfigEditorSlider(minStep = 1, minValue = 1, maxValue = 30)
            public int secondsAlive = 3;

            @Expose
            @ConfigOption(name = "Max Line Width", desc = "Max width of the line.")
            @ConfigEditorSlider(minStep = 1, minValue = 1, maxValue = 10)
            public int lineWidth = 4;

            @Expose
            @ConfigOption(name = "Behind Blocks", desc = "Show behind blocks.")
            @ConfigEditorBoolean
            public boolean behindBlocks = false;
        }
    }


    @Expose
    @ConfigOption(name = "Glowing Dropped Items", desc = "")
    @Accordion
    public GlowingDroppedItems glowingDroppedItems = new GlowingDroppedItems();

    public static class GlowingDroppedItems {

        @Expose
        @ConfigOption(name = "Enabled", desc = "Draws a glowing outline around all dropped items on the ground.")
        @ConfigEditorBoolean
        @FeatureToggle
        public boolean enabled = false;

        @Expose
        @ConfigOption(name = "Highlight Showcase Items", desc = "Draws a glowing outline around showcase items.")
        @ConfigEditorBoolean
        public boolean highlightShowcase = false;

        @Expose
        @ConfigOption(name = "Highlight Fishing Bait", desc = "Draws a glowing outline around fishing bait.")
        @ConfigEditorBoolean
        public boolean highlightFishingBait = false;

    }

    @Expose
    @ConfigOption(name = "Exp Bottles", desc = "Hides all the experience orbs lying on the ground.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean hideExpBottles = false;

    @Expose
    public Position collectionCounterPos = new Position(10, 10, false, true);

    @Expose
    @ConfigOption(name = "Brewing Stand Overlay", desc = "Display the Item names directly inside the Brewing Stand.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean brewingStandOverlay = true;

    @Expose
    @ConfigOption(name = "Red Scoreboard Numbers", desc = "Hide the red scoreboard numbers on the right side of the screen.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean hideScoreboardNumbers = false;

    @Expose
    @ConfigOption(name = "Hide Piggy", desc = "Replacing 'Piggy' with 'Purse' in the Scoreboard.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean hidePiggyScoreboard = true;

    @Expose
    @ConfigOption(name = "Explosions Hider", desc = "Hide explosions.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean hideExplosions = false;

    @Expose
    @ConfigOption(name = "CH Join", desc = "Helps buy a Pass for accessing the Crystal Hollows if needed.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean crystalHollowsJoin = true;

    @Expose
    @ConfigOption(name = "Fire Overlay Hider", desc = "Hide the fire overlay (Like in Skytils).")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean hideFireOverlay = false;

    @Expose
    @ConfigOption(name = "Paste Into Signs", desc = "Allows you to paste the clipboard into signs when you press Ctrl + V.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean pasteIntoSigns = true;

    @Expose
    @ConfigOption(name = "Movement Speed", desc = "Show the player movement speed in blocks per second.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean playerMovementSpeed = false;

    @Expose
    public Position playerMovementSpeedPos = new Position(394, 124, false, true);

    @Expose
    @ConfigOption(name = "Pet Candy Used", desc = "Show the number of Pet Candy used on a pet.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean petCandyUsed = true;

    @Expose
    @ConfigOption(name = "Server Restart Title", desc = "Show a title with seconds remaining until the server restarts after a Game Update or Scheduled Restart.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean serverRestartTitle = true;

    @Expose
    @ConfigOption(name = "Piece Of Wizard Portal", desc = "Restore the Earned By lore line on bought Piece Of Wizard Portal.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean restorePieceOfWizardPortalLore = true;

    @Expose
    @ConfigOption(name = "Patcher Coords Waypoint", desc = "Highlight the coordinates sent by Patcher.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean patcherSendCoordWaypoint = false;


    @Expose
    @ConfigOption(name = "Account Upgrade Reminder", desc = "Remind you to claim account upgrades when complete.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean accountUpgradeReminder = true;

    @Expose
    @ConfigOption(name = "Superpairs Clicks Alert", desc = "Display an alert when you reach the maximum clicks gained from Chronomatron or Ultrasequencer.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean superpairsClicksAlert = false;

    @Expose
    public Position inventoryLoadPos = new Position(394, 124, false, true);
}
