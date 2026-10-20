package codebank.entity_enums;

public enum Sub_Category {

    //HTML SubCategories//
    ROOT_STRUCTURE_HTML("Structure", Language.HTML),
    SECTIONING_HTML("Sectioning", Language.HTML),
    GROUPING_CONTENT_HTML("Grouping", Language.HTML),
    HEADINGS_HTML("Headings", Language.HTML),
    PARAGRAPHS_HTML("Paragraphs", Language.HTML),
    INLINE_SEMANTICS_HTML("Inline Semantics", Language.HTML),
    QUOTATIONS_HTML("Quotations", Language.HTML),
    LISTS_HTML("Lists", Language.HTML),
    IMAGES_GRAPHICS_HTML("Images / Graphics", Language.HTML),
    AUDIO_VIDEO_HTML("Audio / Video", Language.HTML),
    EMBEDDED_CONTENT_HTML("Embedded Content", Language.HTML),
    FORM_CONTAINER_HTML("Forms / Containers", Language.HTML),
    INPUT_CONTROLS_HTML("Input Controls", Language.HTML),
    BUTTONS_HTML("Buttons", Language.HTML),
    FORM_HELPERS_HTML("Form Helpers", Language.HTML),
    TABLE_STRUCTURE_HTML("Table Structures", Language.HTML),
    ROWS_CELLS_HTML("Rows / Cells", Language.HTML),
    TABLE_GROUPING_HTML("Table Grouping", Language.HTML),
    METADATA_INFO_HTML("Metadata Info", Language.HTML),
    RESOURCE_LINKS_HTML("Resources / Links", Language.HTML),
    STYLES_HTML("Styles", Language.HTML),
    SCRIPTS_HTML("Scripts", Language.HTML),
    MODULES_TEMPLATES_HTML("Modules / Templates", Language.HTML),
    INTERACTIVE_ELEMENTS_HTML("Interactive Elements", Language.HTML),
    WEB_COMPONENTS_HTML("Web Components", Language.HTML),
    SHADOW_DOM_HTML("Shadow DOM", Language.HTML),

    //CSS SubCategories//
    DISPLAY_CSS("Display", Language.CSS),
    POSITIONING_CSS("Positioning", Language.CSS),
    FLEXBOX_CSS("Flexbox", Language.CSS),
    GRID_CSS("Grid", Language.CSS),

    MARGIN_PADDING_CSS("Margin & Padding", Language.CSS),
    GAP_CSS("Gap", Language.CSS),

    DIMENSIONS_CSS("Dimensions", Language.CSS),
    ASPECT_RATIO_CSS("Aspect Ratio", Language.CSS),

    FONT_CSS("Font", Language.CSS),
    TEXT_CSS("Text", Language.CSS),

    COLOR_CSS("Color", Language.CSS),
    BACKGROUND_CSS("Background", Language.CSS),
    BORDER_CSS("Border", Language.CSS),
    EFFECTS_CSS("Effects", Language.CSS),
    IMAGE_CSS("Images", Language.CSS),

    TRANSFORM_CSS("Transforms", Language.CSS),
    TRANSITION_CSS("Transitions", Language.CSS),
    KEYFRAME_ANIMATION_CSS("Animations", Language.CSS),

    SCROLLING_CSS("Scrolling", Language.CSS),
    UI_CSS("UI & Interaction", Language.CSS),

    GENERATED_CONTENT_CSS("Generated Content", Language.CSS),
    COUNTERS_CSS("Counters", Language.CSS),

    TABLE_LAYOUT_CSS("Table Layout", Language.CSS),

    VARIABLES_CSS("Variables", Language.CSS),


    //SQL//
    //Data Types//
    NUMERIC_TYPES_SQL("Numeric Types", Language.SQL),
    CHARACTER_TYPES_SQL("Character Types", Language.SQL),
    BINARY_TYPES_SQL("Binary Types", Language.SQL),
    DATE_TIME_TYPES_SQL("Date / Time Types", Language.SQL),
    BOOLEAN_SQL("Boolean Types", Language.SQL),
    STRUCTURED_TYPES_SQL("Structured Types", Language.SQL),
    //Keywords//
    DATA_DEFINITION_DDL_SQL("Data Definition", Language.SQL),
    DATA_MANIPULATION_DML_SQL("Data Manipulation", Language.SQL),
    QUERY_CLAUSES_SQL("Query Clauses", Language.SQL),
    JOIN_KEYWORDS_SQL("Join Keywords", Language.SQL),
    CONTROL_LOGIC_SQL("Control Logic", Language.SQL),
    TRANSACTION_SQL("Transactions", Language.SQL),
    ACCESS_CONTROL_SQL("Access Control", Language.SQL),
    //Functions//
    SCALAR_FUNCTIONS_SQL("Scalar Functions", Language.SQL),
    AGGREGATE_FUNCTIONS_SQL("Aggregate Functions", Language.SQL),
    WINDOW_ANALYTIC_FUNCTIONS_SQL("Window Analytic Functions", Language.SQL),
    CONDITIONAL_FUNCTIONS_SQL("Conditional Functions", Language.SQL),
    JSON_FUNCTIONS_SQL("Json Functions", Language.SQL),
    XML_FUNCTIONS_SQL("XML Functions", Language.SQL),
    SPATIAL_FUNCTIONS_SQL("Spatial Functions", Language.SQL),
    //Server Functions//
    SYSTEM_INFORMATION_SQL("System Information", Language.SQL),
    CONNECTION_SESSION_INFORMATION_SQL("Connection Session Information", Language.SQL),
    ENVIRONMENT_METADATA_SQL("Environment Metadata", Language.SQL),
    ERROR_DIAGNOSTIC_SQL("Error Diagnostics", Language.SQL),
    //Access Functions//
    PRIVILEGE_MANAGEMENT_SQL("Privilege Management", Language.SQL),
    ROLE_USER_MANAGEMENT_SQL("Role Management", Language.SQL),
    SECURITY_FUNCTIONS_SQL("Security Functions", Language.SQL),
    AUTHENTICATION_AUTHORIZATION_SQL("Authentication / Authorization", Language.SQL);

    private Language language;
    private String subCategory;

    Sub_Category(String subCategory, Language language) {
        this.subCategory = subCategory;
        this.language = language;
    }

    public String getSubCategory() {
        return subCategory;
    }
    public Language getLanguage() {
        return language;
    }

}
