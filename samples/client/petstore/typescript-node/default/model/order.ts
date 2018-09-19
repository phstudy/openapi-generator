/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * An order for a pets from the pet store
 */
export class Order {
  "id"?: number;
  "petId"?: number;
  "quantity"?: number;
  "shipDate"?: Date;
  /**
   * Order Status
   */
  "status"?: Order.StatusEnum;
  "complete"?: boolean;

  static discriminator: string | undefined = undefined;

  static attributeTypeMap: Array<{
    name: string;
    baseName: string;
    type: string;
  }> = [
    {
      name: "id",
      baseName: "id",
      type: "number"
    },
    {
      name: "petId",
      baseName: "petId",
      type: "number"
    },
    {
      name: "quantity",
      baseName: "quantity",
      type: "number"
    },
    {
      name: "shipDate",
      baseName: "shipDate",
      type: "Date"
    },
    {
      name: "status",
      baseName: "status",
      type: "Order.StatusEnum"
    },
    {
      name: "complete",
      baseName: "complete",
      type: "boolean"
    }
  ];

  static getAttributeTypeMap() {
    return Order.attributeTypeMap;
  }
}

export namespace Order {
  export enum StatusEnum {
    Placed = <any>"placed",
    Approved = <any>"approved",
    Delivered = <any>"delivered"
  }
}
