package codebank.entity_enums;

import java.util.List;

public enum Category {

    //HTML Categories//
    STRUCTURAL_HTML("Structural",Language.HTML, List.of(SubCategory.ROOT_STRUCTURE_HTML,
            SubCategory.SECTIONING_HTML,
            SubCategory.GROUPING_CONTENT_HTML)),
    TEXT_HTML("Text",Language.HTML, List.of(SubCategory.HEADINGS_HTML,
            SubCategory.PARAGRAPHS_HTML,
            SubCategory.INLINE_SEMANTICS_HTML,
            SubCategory.QUOTATIONS_HTML,
            SubCategory.LISTS_HTML)),
    MEDIA_HTML("Media",Language.HTML, List.of(SubCategory.IMAGES_GRAPHICS_HTML,
            SubCategory.AUDIO_VIDEO_HTML,
            SubCategory.EMBEDDED_CONTENT_HTML)),
    FORM_HTML("Forms",Language.HTML, List.of(SubCategory.FORM_CONTAINER_HTML,
            SubCategory.INPUT_CONTROLS_HTML,
            SubCategory.BUTTONS_HTML,
            SubCategory.FORM_HELPERS_HTML)),
    TABLE_HTML("Tables / Lists",Language.HTML, List.of(SubCategory.TABLE_STRUCTURE_HTML,
            SubCategory.ROWS_CELLS_HTML,
            SubCategory.TABLE_GROUPING_HTML)),
    METADATA_HTML("Metadata",Language.HTML, List.of(SubCategory.METADATA_INFO_HTML,
            SubCategory.RESOURCE_LINKS_HTML,
            SubCategory.STYLES_HTML)),
    SCRIPTING_HTML("Scripting",Language.HTML, List.of(SubCategory.SCRIPTS_HTML,
            SubCategory.MODULES_TEMPLATES_HTML)),
    INTERACTIVE_HTML("Interactive",Language.HTML, List.of(SubCategory.INTERACTIVE_ELEMENTS_HTML)),

    //CSS Categories//
    LAYOUT_CSS("Layout", Language.CSS, List.of(
            SubCategory.DISPLAY_CSS,
            SubCategory.POSITIONING_CSS,
            SubCategory.FLEXBOX_CSS,
            SubCategory.GRID_CSS)),
    SPACING_CSS("Spacing", Language.CSS, List.of(
            SubCategory.MARGIN_PADDING_CSS,
            SubCategory.GAP_CSS)),
    SIZING_CSS("Sizing", Language.CSS, List.of(
            SubCategory.DIMENSIONS_CSS,
            SubCategory.ASPECT_RATIO_CSS)),
    TYPOGRAPHY_CSS("Typography", Language.CSS, List.of(
            SubCategory.FONT_CSS,
            SubCategory.TEXT_CSS)),
    VISUAL_CSS("Visual", Language.CSS, List.of(
            SubCategory.COLOR_CSS,
            SubCategory.BACKGROUND_CSS,
            SubCategory.BORDER_CSS,
            SubCategory.EFFECTS_CSS,
            SubCategory.IMAGE_CSS)),
    ANIMATION_CSS("Animation", Language.CSS, List.of(
            SubCategory.TRANSFORM_CSS,
            SubCategory.TRANSITION_CSS,
            SubCategory.KEYFRAME_ANIMATION_CSS)),
    INTERACTION_CSS("Interaction", Language.CSS, List.of(
            SubCategory.SCROLLING_CSS,
            SubCategory.UI_CSS)),
    CONTENT_CSS("Content", Language.CSS, List.of(
            SubCategory.GENERATED_CONTENT_CSS,
            SubCategory.COUNTERS_CSS)),
    TABLE_CSS("Tables", Language.CSS, List.of(
            SubCategory.TABLE_LAYOUT_CSS)),
    CUSTOM_PROPERTIES_CSS("Custom Properties", Language.CSS, List.of(
            SubCategory.VARIABLES_CSS)),

    //SQL Categories//
    DATA_TYPES_SQL("Data Types", Language.SQL, List.of(SubCategory.NUMERIC_TYPES_SQL,
            SubCategory.CHARACTER_TYPES_SQL,
            SubCategory.BINARY_TYPES_SQL,
            SubCategory.DATE_TIME_TYPES_SQL,
            SubCategory.BOOLEAN_SQL,
            SubCategory.STRUCTURED_TYPES_SQL)),
    KEYWORDS_SQL("Keywords", Language.SQL, List.of(SubCategory.DATA_DEFINITION_DDL_SQL,
            SubCategory.DATA_MANIPULATION_DML_SQL,
            SubCategory.QUERY_CLAUSES_SQL,
            SubCategory.JOIN_KEYWORDS_SQL,
            SubCategory.CONTROL_LOGIC_SQL,
            SubCategory.TRANSACTION_SQL,
            SubCategory.ACCESS_CONTROL_SQL)),
    FUNCTIONS_SQL("Functions", Language.SQL, List.of(SubCategory.SCALAR_FUNCTIONS_SQL,
            SubCategory.AGGREGATE_FUNCTIONS_SQL,
            SubCategory.WINDOW_ANALYTIC_FUNCTIONS_SQL,
            SubCategory.CONDITIONAL_FUNCTIONS_SQL,
            SubCategory. JSON_FUNCTIONS_SQL,
            SubCategory.XML_FUNCTIONS_SQL,
            SubCategory.SPATIAL_FUNCTIONS_SQL)),
    SERVER_FUNCTIONS_SQL("Server Functions", Language.SQL, List.of(SubCategory.SYSTEM_INFORMATION_SQL,
            SubCategory.CONNECTION_SESSION_INFORMATION_SQL,
            SubCategory. ENVIRONMENT_METADATA_SQL,
            SubCategory.ERROR_DIAGNOSTIC_SQL)),
    ACCESS_FUNCTIONS_SQL("Access Functions", Language.SQL, List.of(SubCategory.PRIVILEGE_MANAGEMENT_SQL,
            SubCategory. ROLE_USER_MANAGEMENT_SQL,
            SubCategory. SECURITY_FUNCTIONS_SQL,
            SubCategory. AUTHENTICATION_AUTHORIZATION_SQL));



    private final String category;
    private final Language language;
    private List<SubCategory> subcategories;

    Category(String category, Language language) {
        this.category = category;
        this.language = language;
    }
    Category(String category, Language language, List<SubCategory> subcategories) {
        this.category = category;
        this.language = language;
        this.subcategories = subcategories;
    }

    public String getCategory() {
        return category;
    }

    public List<SubCategory> getSubCategories() {
        return subcategories;
    }

    public Language getLanguage() {
        return language;
    }
}
