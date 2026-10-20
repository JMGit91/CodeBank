package codebank.entity_enums;

import java.util.List;

public enum Category {

    //HTML Categories//
    STRUCTURAL_HTML("Structural",Language.HTML, List.of(Sub_Category.ROOT_STRUCTURE_HTML,
            Sub_Category.SECTIONING_HTML,
            Sub_Category.GROUPING_CONTENT_HTML)),
    TEXT_HTML("Text",Language.HTML, List.of(Sub_Category.HEADINGS_HTML,
            Sub_Category.PARAGRAPHS_HTML,
            Sub_Category.INLINE_SEMANTICS_HTML,
            Sub_Category.QUOTATIONS_HTML,
            Sub_Category.LISTS_HTML)),
    MEDIA_HTML("Media",Language.HTML, List.of(Sub_Category.IMAGES_GRAPHICS_HTML,
            Sub_Category.AUDIO_VIDEO_HTML,
            Sub_Category.EMBEDDED_CONTENT_HTML)),
    FORM_HTML("Forms",Language.HTML, List.of(Sub_Category.FORM_CONTAINER_HTML,
            Sub_Category.INPUT_CONTROLS_HTML,
            Sub_Category.BUTTONS_HTML,
            Sub_Category.FORM_HELPERS_HTML)),
    TABLE_HTML("Tables / Lists",Language.HTML, List.of(Sub_Category.TABLE_STRUCTURE_HTML,
            Sub_Category.ROWS_CELLS_HTML,
            Sub_Category.TABLE_GROUPING_HTML)),
    METADATA_HTML("Metadata",Language.HTML, List.of(Sub_Category.METADATA_INFO_HTML,
            Sub_Category.RESOURCE_LINKS_HTML,
            Sub_Category.STYLES_HTML)),
    SCRIPTING_HTML("Scripting",Language.HTML, List.of(Sub_Category.SCRIPTS_HTML,
            Sub_Category.MODULES_TEMPLATES_HTML)),
    INTERACTIVE_HTML("Interactive",Language.HTML, List.of(Sub_Category.INTERACTIVE_ELEMENTS_HTML)),

    //CSS Categories//
    LAYOUT_CSS("Layout", Language.CSS, List.of(
            Sub_Category.DISPLAY_CSS,
            Sub_Category.POSITIONING_CSS,
            Sub_Category.FLEXBOX_CSS,
            Sub_Category.GRID_CSS)),
    SPACING_CSS("Spacing", Language.CSS, List.of(
            Sub_Category.MARGIN_PADDING_CSS,
            Sub_Category.GAP_CSS)),
    SIZING_CSS("Sizing", Language.CSS, List.of(
            Sub_Category.DIMENSIONS_CSS,
            Sub_Category.ASPECT_RATIO_CSS)),
    TYPOGRAPHY_CSS("Typography", Language.CSS, List.of(
            Sub_Category.FONT_CSS,
            Sub_Category.TEXT_CSS)),
    VISUAL_CSS("Visual", Language.CSS, List.of(
            Sub_Category.COLOR_CSS,
            Sub_Category.BACKGROUND_CSS,
            Sub_Category.BORDER_CSS,
            Sub_Category.EFFECTS_CSS,
            Sub_Category.IMAGE_CSS)),
    ANIMATION_CSS("Animation", Language.CSS, List.of(
            Sub_Category.TRANSFORM_CSS,
            Sub_Category.TRANSITION_CSS,
            Sub_Category.KEYFRAME_ANIMATION_CSS)),
    INTERACTION_CSS("Interaction", Language.CSS, List.of(
            Sub_Category.SCROLLING_CSS,
            Sub_Category.UI_CSS)),
    CONTENT_CSS("Content", Language.CSS, List.of(
            Sub_Category.GENERATED_CONTENT_CSS,
            Sub_Category.COUNTERS_CSS)),
    TABLE_CSS("Tables", Language.CSS, List.of(
            Sub_Category.TABLE_LAYOUT_CSS)),
    CUSTOM_PROPERTIES_CSS("Custom Properties", Language.CSS, List.of(
            Sub_Category.VARIABLES_CSS)),

    //SQL Categories//
    DATA_TYPES_SQL("Data Types", Language.SQL, List.of(Sub_Category.NUMERIC_TYPES_SQL,
            Sub_Category.CHARACTER_TYPES_SQL,
            Sub_Category.BINARY_TYPES_SQL,
            Sub_Category.DATE_TIME_TYPES_SQL,
            Sub_Category.BOOLEAN_SQL,
            Sub_Category.STRUCTURED_TYPES_SQL)),
    KEYWORDS_SQL("Keywords", Language.SQL, List.of(Sub_Category.DATA_DEFINITION_DDL_SQL,
            Sub_Category.DATA_MANIPULATION_DML_SQL,
            Sub_Category.QUERY_CLAUSES_SQL,
            Sub_Category.JOIN_KEYWORDS_SQL,
            Sub_Category.CONTROL_LOGIC_SQL,
            Sub_Category.TRANSACTION_SQL,
            Sub_Category.ACCESS_CONTROL_SQL)),
    FUNCTIONS_SQL("Functions", Language.SQL, List.of(Sub_Category.SCALAR_FUNCTIONS_SQL,
            Sub_Category.AGGREGATE_FUNCTIONS_SQL,
            Sub_Category.WINDOW_ANALYTIC_FUNCTIONS_SQL,
            Sub_Category.CONDITIONAL_FUNCTIONS_SQL,
            Sub_Category. JSON_FUNCTIONS_SQL,
            Sub_Category.XML_FUNCTIONS_SQL,
            Sub_Category.SPATIAL_FUNCTIONS_SQL)),
    SERVER_FUNCTIONS_SQL("Server Functions", Language.SQL, List.of(Sub_Category.SYSTEM_INFORMATION_SQL,
            Sub_Category.CONNECTION_SESSION_INFORMATION_SQL,
            Sub_Category. ENVIRONMENT_METADATA_SQL,
            Sub_Category.ERROR_DIAGNOSTIC_SQL)),
    ACCESS_FUNCTIONS_SQL("Access Functions", Language.SQL, List.of(Sub_Category.PRIVILEGE_MANAGEMENT_SQL,
            Sub_Category. ROLE_USER_MANAGEMENT_SQL,
            Sub_Category. SECURITY_FUNCTIONS_SQL,
            Sub_Category. AUTHENTICATION_AUTHORIZATION_SQL));



    private final String category;
    private final Language language;
    private List<Sub_Category> subcategories;

    Category(String category, Language language) {
        this.category = category;
        this.language = language;
    }
    Category(String category, Language language, List<Sub_Category> subcategories) {
        this.category = category;
        this.language = language;
        this.subcategories = subcategories;
    }

    public String getCategory() {
        return category;
    }

    public List<Sub_Category> getSubCategories() {
        return subcategories;
    }

    public Language getLanguage() {
        return language;
    }
}
