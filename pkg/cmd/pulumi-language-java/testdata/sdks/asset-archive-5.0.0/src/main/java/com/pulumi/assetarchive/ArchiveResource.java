// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.assetarchive;

import com.pulumi.asset.Archive;
import com.pulumi.assetarchive.ArchiveResourceArgs;
import com.pulumi.assetarchive.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import javax.annotation.Nullable;

@ResourceType(type="asset-archive:index:ArchiveResource")
public class ArchiveResource extends com.pulumi.resources.CustomResource {
    @Export(name="value", refs={Archive.class}, tree="[0]")
    private Output<Archive> value;

    public Output<Archive> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ArchiveResource(java.lang.String name) {
        this(name, ArchiveResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ArchiveResource(java.lang.String name, ArchiveResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ArchiveResource(java.lang.String name, ArchiveResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("asset-archive:index:ArchiveResource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ArchiveResource(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("asset-archive:index:ArchiveResource", name, null, makeResourceOptions(options, id), false);
    }

    private static ArchiveResourceArgs makeArgs(ArchiveResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ArchiveResourceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ArchiveResource get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ArchiveResource(name, id, options);
    }
}
